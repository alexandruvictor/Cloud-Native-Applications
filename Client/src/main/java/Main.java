import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.PersonOuterClass;
import proto.PersonServiceGrpc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999).usePlaintext().build();

        PersonServiceGrpc.PersonServiceStub personStub=PersonServiceGrpc.newStub(channel);

        System.out.println("MENU");
        System.out.println("1. Set a Person name and CNP");
        System.out.println("2. Get a Person Info");
        System.out.println("3. QUIT");

        boolean isConnected = true;

        while (isConnected) {
            Scanner input = new Scanner(System.in);
            System.out.println("Choose an option:");
            int option = input.nextInt();

            switch (option) {

            }
        }
        channel.shutdown();
    }
}
