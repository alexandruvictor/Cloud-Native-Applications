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

                case 1: {
                    Scanner read = new Scanner(System.in).useDelimiter("\n"); /* Read until break line*/
                    System.out.println("NAME: ");
                    String name = read.next();

                    System.out.println("CNP:");
                    String CNP=read.next();

                    personStub.setPerson(
                            PersonOuterClass.Person.newBuilder()
                                    .setName(name)
                                    .setCNP(CNP).build(),
                            new StreamObserver<PersonOuterClass.Empty>() {
                                @Override
                                public void onNext(PersonOuterClass.Empty empty) {

                                }

                                @Override
                                public void onError(Throwable throwable) {
                                    System.out.println("Error : " + throwable.getMessage());
                                }

                                @Override
                                public void onCompleted() {

                                }
                            }
                    );
                    break;
                }

                case 2: {
                    Scanner read = new Scanner(System.in).useDelimiter("\n");
                    System.out.println("Name of person:");
                    String name=read.next();

                    personStub.getPerson(PersonOuterClass.PersonRequest.newBuilder().setName(name).build(),
                            new StreamObserver<PersonOuterClass.PersonResponse>() {
                                @Override
                                public void onNext(PersonOuterClass.PersonResponse personResponse) {
                                    System.out.println(personResponse);
                                }

                                @Override
                                public void onError(Throwable throwable) {
                                    System.out.println("Error : " + throwable.getMessage());
                                }

                                @Override
                                public void onCompleted() {

                                }
                            });
                    break;
                }

                case 3: {
                    isConnected = false;
                    break;
                }
                default:
                    System.out.println("Unknown command, insert a valid command!");
            }
        }
        channel.shutdown();
    }
}
