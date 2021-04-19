package services;

import io.grpc.stub.StreamObserver;
import proto.Gate;
import proto.ServiceZodiacChineseGrpc;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ZodiacChinese extends ServiceZodiacChineseGrpc.ServiceZodiacChineseImplBase {
    public ArrayList<Zodie> listZodii = new ArrayList<Zodie>();
    @Override
    public void geZodiacChinese(Gate.PersonRequest request, StreamObserver<Gate.PersonResponse> responseObserver) {

        Gate.PersonResponse.Builder response= Gate.PersonResponse.newBuilder();

        LogicZodiac logic=new LogicZodiac();
        try {
            logic.readZodiacFile("C:\\Users\\Alexandru Victor\\Desktop" +
                    "\\Tema2\\ServerZodiac\\src\\main\\resources\\chineseZodiac.txt", listZodii);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String zodie = "";

        try {
            zodie = logic.findZodiacChinese(request.getDate(), listZodii);
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