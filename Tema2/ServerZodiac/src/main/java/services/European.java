package services;

import io.grpc.stub.StreamObserver;
import proto.Gate;
import proto.ServiceZodiacEuropeanGrpc;
import proto.ZodiacEuropean;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;

public class European extends ServiceZodiacEuropeanGrpc.ServiceZodiacEuropeanImplBase {
    public ArrayList<Zodie> listZodii = new ArrayList<Zodie>();
    @Override
    public void getZodiacEuropean(Gate.PersonRequest request, StreamObserver<Gate.PersonResponse> responseObserver) {
       Gate.PersonResponse.Builder response=Gate.PersonResponse.newBuilder();

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
