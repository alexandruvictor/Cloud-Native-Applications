package services;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import proto.PersonOuterClass;
import proto.PersonServiceGrpc;

import javax.print.DocFlavor;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Person extends PersonServiceGrpc.PersonServiceImplBase {
    List<PersonOuterClass.Person> personList=new ArrayList<>();

    @Override
    public void setPerson(PersonOuterClass.Person request, StreamObserver<PersonOuterClass.Empty> responseObserver) {

     if(!Verify(request))
     {
         System.out.println("ERROR");
         Status status=Status.PERMISSION_DENIED.withDescription("ERROR CNP!");
         responseObserver.onError(status.asRuntimeException());
     }
     else {
         System.out.println("Set person accessed!");

         personList.add(request);

         PersonOuterClass.Empty.Builder response = PersonOuterClass.Empty.newBuilder();
         responseObserver.onNext(response.build());
         responseObserver.onCompleted();
     }
    }

    public boolean Verify(PersonOuterClass.Person request)
    {
        if(request.getCNP().length()!=13)
            return false;

        //isNumeric
        for(char e: request.getCNP().toCharArray())
            if(!Character.isDigit(e))
                return false;

        if(!(request.getCNP().charAt(0) == '1' || request.getCNP().charAt(0) == '2' ||
                request.getCNP().charAt(0) == '5' || request.getCNP().charAt(0) == '6'))
            return false;

        if(Integer.parseInt(request.getCNP().substring(3,5))>12 ||
                Integer.parseInt(request.getCNP().substring(3,5))<0 )
            return false;

        if(Integer.parseInt(request.getCNP().substring(5,7))>31 ||
                Integer.parseInt(request.getCNP().substring(5,7))<0 )
            return false;
        return true;
    }

    @Override
    public void getPerson(PersonOuterClass.PersonRequest request, StreamObserver<PersonOuterClass.PersonResponse> responseObserver) {
        System.out.println("Person accessed!");

        PersonOuterClass.PersonResponse.Builder response=
                PersonOuterClass.PersonResponse.newBuilder();

        PersonOuterClass.Person.Builder person=null;

        //search person
        PersonOuterClass.Person searchPerson=personList.stream().filter(element->element.getName().equals(
                request.getName()
        )).findFirst().orElse(null);

        if(searchPerson==null)
        {
            Status status=Status.NOT_FOUND.withDescription("Person not found!");
            responseObserver.onError(status.asRuntimeException());
        }
        else
            person=searchPerson.toBuilder();

        setGenderPerson(person);
        setAgePerson(person);
        response.setPerson(person);

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        showInfoPerson(person);
    }

    private void setGenderPerson( PersonOuterClass.Person.Builder person)
    {
        if(person.getCNP().charAt(0) == '6' || person.getCNP().charAt(0) == '2')
            person.setGender("Feminin");
        else
        if(person.getCNP().charAt(0) == '1' || person.getCNP().charAt(0) == '5')
            person.setGender("Masculin");
    }

    private void showInfoPerson(PersonOuterClass.Person.Builder person)
    {
        System.out.println("Name: "+ person.getName());
        System.out.println("CNP: "+ person.getCNP());
        System.out.println("Gender: "+ person.getGender());
        System.out.println("Age: "+ person.getAge());
    }

    private void setAgePerson(PersonOuterClass.Person.Builder person)
    {
        int age=0;
        int year = Year.now().getValue();
        int month = YearMonth.now().getMonthValue();

        if(person.getCNP().charAt(0) > '2')
            if(Integer.parseInt(person.getCNP().substring(3, 5)) >= month)
                age = year - (2000 + Integer.parseInt(person.getCNP().substring(1, 3))) - 1;
            else
                age = year - (2000 + Integer.parseInt(person.getCNP().substring(1, 3)));

        if(person.getCNP().charAt(0) < '3')
            if(Integer.parseInt(person.getCNP().substring(3, 5)) >= month)
                age = year - (1900 + Integer.parseInt(person.getCNP().substring(1, 3))) - 1;
            else
                age = year - (1900 + Integer.parseInt(person.getCNP().substring(1, 3)));

        person.setAge(age);
    }
}






