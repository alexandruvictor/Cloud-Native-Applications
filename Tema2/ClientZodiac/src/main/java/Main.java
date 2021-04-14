import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.PersonServiceZodiacGrpc;
import proto.PersonZodiacOuterClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    final static String DATE_FORMAT = "dd/MM/yyyy";

    public static boolean isDateValid(String date) {
        try {
            DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } catch (InputMismatchException e) {
            System.out.println(e);
            return false;
        } catch (ParseException e) {
            System.out.println(e);
            return false;
        } catch (DateTimeException e) {
            System.out.println(e);
            return false;
        }

    }


    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress
                ("localhost", 8999).usePlaintext().build();

       PersonServiceZodiacGrpc.PersonServiceZodiacStub personStub =
               PersonServiceZodiacGrpc.newStub(channel);

        System.out.println("Meniu:");
        System.out.println("1. Set a date to get zodiac:");
        System.out.println("2. QUIT");

        boolean isConnected = true;

        while (isConnected) {
            Scanner input = new Scanner(System.in);
            System.out.println("Chose an Option");
            int option = input.nextInt();

            switch (option) {

                case 1: {
                    System.out.println("Date:");
                    String date = input.next();

                    while (!isDateValid(date)) {
                        System.out.println("Error on date!");
                        date=input.next();
                    }

                        personStub.getPersonZodiac(
                                PersonZodiacOuterClass.PersonZodiac.newBuilder()
                                        .setDate(date).build(),
                                new StreamObserver<PersonZodiacOuterClass.PersonZodiacResponse>() {
                                    @Override
                                    public void onNext(PersonZodiacOuterClass.PersonZodiacResponse personZodiacResponse) {
                                        System.out.println(personZodiacResponse);
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

                case 2 :
                {
                    isConnected = false;
                    break;
                }

                default: {
                    System.out.println("Unknown command, insert a valid command!");
                }


            }

        }
    }
}
