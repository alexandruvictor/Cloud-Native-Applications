package services;

import io.grpc.stub.StreamObserver;
import proto.PersonServiceZodiacGrpc;
import proto.PersonZodiacOuterClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PersonZodiac extends PersonServiceZodiacGrpc.PersonServiceZodiacImplBase {
    public ArrayList<Zodie> listZodii = new ArrayList<Zodie>();
    private static String date_format = "dd/MM/yyyy";

    public void readZodiacFile() throws FileNotFoundException {
        try {
            File file = new File(
                    "C:\\Users\\Alexandru Victor\\Desktop\\Cloud-Native-Applications" +
                            "\\Tema2\\ServerZodiac\\src\\main\\resources\\DateZodiac.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String nume = sc.next();
                String data_inceput = sc.next();
                String data_sfarsit = sc.next();
                Zodie zodie = new Zodie(nume, data_inceput, data_sfarsit);
                listZodii.add(zodie);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR" + e);
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }

    public String findZodiac(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(date_format);
        Date date1 = dateFormat.parse(date);

        DateFormat dateFormat2 = new SimpleDateFormat("YYYY");
        String year = "/" + dateFormat2.format(date1).toUpperCase();

        for (int index = 0; index < listZodii.size(); index++) {
            String b = listZodii.get(index).getData_inceput() + year;
            Date begin = dateFormat.parse(b);

            String e = listZodii.get(index).getData_sfarsit() + year;
            Date end = dateFormat.parse(e);

            if (date1.after(begin) && date1.before(end) || date1.equals(begin) || date1.equals(end)) {
                return listZodii.get(index).getNume();
            }
        }
        return null;
    }

    @Override
    public void getPersonZodiac(PersonZodiacOuterClass.PersonZodiac request,
                                StreamObserver<PersonZodiacOuterClass.PersonZodiacResponse> responseObserver) {
        PersonZodiacOuterClass.PersonZodiacResponse.Builder response = PersonZodiacOuterClass.PersonZodiacResponse.newBuilder();

        String zodie = "";
        try {
            readZodiacFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            zodie = findZodiac(request.getDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Date:" + request.getDate());
        System.out.println("Zodiac sign:" + zodie);

        response.setData(request.getDate());
        response.setZodiac(zodie);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
