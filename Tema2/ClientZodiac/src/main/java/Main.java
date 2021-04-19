import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.Gate;
import proto.ZodiacServiceGrpc;

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
    public enum choicesEuropean {eu, european, European, euro,};
    public enum choicesChinese { Chinese, chinese, chines, china, China};

    public static int isChoiceValid(String choice)
    {
      for(choicesEuropean c: choicesEuropean.values())
      {
          if(c.name().equals(choice))
              return 1;
      }

        for(choicesChinese c: choicesChinese.values())
        {
            if(c.name().equals(choice))
                return 2;
        }
      return 0;
    }


    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress
                ("localhost", 8999).usePlaintext().build();


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
                        date = input.next();
                    }
                    System.out.println("Zodiac type:");
                    System.out.println("1. European;");
                    System.out.println("2. Chinese;");

                    String choice = input.next();
                    while (isChoiceValid(choice)==0) {
                        System.out.println("Error on choice!");
                        choice = input.next();

                    }
                    if(isChoiceValid(choice)==1)
                    {
                        choice="european";
                    }
                    else
                    {
                        choice="chinese";
                    }


                    ZodiacServiceGrpc.ZodiacServiceStub zodiacServiceStub=
                            ZodiacServiceGrpc.newStub(channel);

                    zodiacServiceStub.getPerson(

                            Gate.PersonRequest.newBuilder()
                                    .setDate(date)
                                    .setChoice(choice)
                                    .build(),

                            new StreamObserver<Gate.PersonResponse>() {
                                @Override
                                public void onNext(Gate.PersonResponse personResponse) {
                                    System.out.println(personResponse);
                                }

                                @Override
                                public void onError(Throwable throwable) {

                                }

                                @Override
                                public void onCompleted() {

                                }
                            }

                    );



                    break;
                }

                case 2: {
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
