package services;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LogicZodiac {

    private static String date_format = "dd/MM/yyyy";

    public void LogicZodiac() {

    }

    public void readZodiacFile(String fileText, ArrayList<Zodie> listZodii) throws FileNotFoundException {
        try {
            File file = new File(fileText);
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

    public String findZodiac(String date, String choice,  ArrayList<Zodie> listZodii) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(date_format);
        Date date1 = dateFormat.parse(date);

        DateFormat dateFormat2 = new SimpleDateFormat("YYYY");
        String year = "/" + dateFormat2.format(date1).toUpperCase();
        String b;
        String e;
        for (int index = 0; index < listZodii.size(); index++) {
            if(choice.equals("european")) {
                b = listZodii.get(index).getData_inceput() + year;
                e = listZodii.get(index).getData_sfarsit() + year;
            }
            else {
                b = listZodii.get(index).getData_inceput();
                e = listZodii.get(index).getData_sfarsit();
            }

            Date begin = dateFormat.parse(b);
            Date end = dateFormat.parse(e);

            if (date1.after(begin) && date1.before(end) || date1.equals(begin) || date1.equals(end)) {
                return listZodii.get(index).getNume();
            }
        }
        return null;
    }
}
