package services;

import io.grpc.stub.StreamObserver;
import proto.ZodiacEuropean;
import proto.ZodiacServiceGrpc;

public class Gate extends ZodiacServiceGrpc.ZodiacServiceImplBase {

    @Override
    public void getPerson(proto.Gate.PersonRequest request, StreamObserver<proto.Gate.PersonResponse> responseObserver) {

            System.out.println("date"+request.getDate());

      if(request.getChoice().equals("european"))
      {
          new European().getZodiacEuropean(request, responseObserver);
      }
      else if(request.getChoice().equals("chinese"))
      {
          new ZodiacChinese().geZodiacChinese(request, responseObserver);
      }
      else
      {
         System.out.println("error choice");
      }

    }
}
