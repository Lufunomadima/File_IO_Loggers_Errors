
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        //TODO : test code should come here
        Scanner inputReader = new Scanner(System.in);


        System.out.println("Enter Student Full Name : ");
        String fullName = inputReader.nextLine();

        System.out.println("Assistant Name : ");
        String nameOfPersonWhoAssistedTheVisitor = inputReader.nextLine();

        System.out.println("Comments : ");
        String comments = inputReader.nextLine();


        LocalDate dateOfVisit = LocalDate.now();
        LocalTime timeOfVisits = LocalTime.now();

        System.out.println("How old is the student : ");
        int age = inputReader.nextInt();

        Visitor objVisit = new Visitor(fullName,nameOfPersonWhoAssistedTheVisitor, comments,dateOfVisit,timeOfVisits, age);

        // Save : IT save the data passes when creating an object
        objVisit.save();

        // load data : load a file containing data of a given visitor
        objVisit.load(fullName);
    }
}



