package services;

import io.grpc.stub.StreamObserver;
import proto.PersonServiceZodiacChineseGrpc;
import proto.PersonZodiacChineseOuterClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PersonZodiacChinese extends PersonServiceZodiacChineseGrpc.PersonServiceZodiacChineseImplBase {

    public ArrayList<Zodie> listZodii = new ArrayList<Zodie>();
    private static String date_format = "dd/MM/yyyy";

    @Override
    public void getPersonZodiacChinese(PersonZodiacChineseOuterClass.PersonZodiacChinese request, StreamObserver<PersonZodiacChineseOuterClass.PersonZodiacChineseResponse> responseObserver) {

        PersonZodiacChineseOuterClass.PersonZodiacChineseResponse.Builder response=
                PersonZodiacChineseOuterClass.PersonZodiacChineseResponse.newBuilder();

        LogicZodiac logic=new LogicZodiac();
        try {
            logic.readZodiacFile("C:\\Users\\Alexandru Victor\\Desktop" +
                    "\\Tema2\\ServerZodiac\\src\\main\\resources\\chineseZodiac.txt", listZodii);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String zodie = "";

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



    public String findZodiac(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(date_format);
        Date date1 = dateFormat.parse(date);

        for (Zodie zodie : listZodii) {
            String b = zodie.getData_inceput();// + year;
            Date begin = dateFormat.parse(b);

            String e = zodie.getData_sfarsit();// + year;
            Date end = dateFormat.parse(e);

            if (date1.after(begin) && date1.before(end) || date1.equals(begin) || date1.equals(end)) {
                return zodie.getNume();
            }
        }
        return null;
    }



}
