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

    @Override
    public void getPersonZodiac(PersonZodiacOuterClass.PersonZodiac request,
                                StreamObserver<PersonZodiacOuterClass.PersonZodiacResponse> responseObserver) {
        PersonZodiacOuterClass.PersonZodiacResponse.Builder response = PersonZodiacOuterClass.PersonZodiacResponse.newBuilder();

        LogicZodiac logic=new LogicZodiac();
        try {
            logic.readZodiacFile( "C:\\Users\\Alexandru Victor\\Desktop\\Cloud-Native-Applications" +
                    "\\Tema2\\ServerZodiac\\src\\main\\resources\\DateZodiac.txt", listZodii);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String zodie = "";

        try {
            zodie = logic.findZodiac(request.getDate(), listZodii);
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
