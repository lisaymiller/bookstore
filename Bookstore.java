//methods are functions that belong to a class

import java.util.Scanner;
import java.time.*;

public class Bookstore {

    static String address() {

        return "Our address is 1414 S Tryon St, Charlotte NC. Please visit us! We'd love to see you.";

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        OpeningHours check = new OpeningHours();

        LocalDate date = LocalDate.now();
        DayOfWeek dow = date.getDayOfWeek();
        String getDOW = dow.toString();

        String stop;

        System.out.println("Welcome to Lisa's Bookstore!");

        do {

            System.out.println("Is there anything I can help you with today? (Y/N)");

            stop = scan.nextLine().toUpperCase();

            System.out.println("What can I help you with today?");

            String answer = scan.nextLine().toUpperCase();

            if (answer.contains("ADDRESS") == true) {
                System.out.println(address());
                // calling a method outside of main method but in same file; static object, no
                // need for constructor
            }

            if (answer.contains("HOURS")) {
                System.out.println(
                        "I understand you are interested in our business hours. \nWhat day are you interested in visiting us?");
                String input = scan.nextLine().toUpperCase();

                System.out.println(check.openTime(input));
                // calling an external method; public object, requires constructor
            }

            if ((answer.contains("OPEN") && ((answer.contains("NOW") || (answer.contains("TODAY")))))) {
                System.out.println(check.openTime(getDOW));
            }

            if ((answer.contains("WHEN") && ((answer.contains("CLOSE") || (answer.contains("CLOSED")))))) {
                System.out.println(check.openTime(getDOW));
            }

            if ((answer.contains("USED")) || (answer.contains("NEW"))) {
                System.out.println(
                        "Here at Lisa's Bookstore, we carry both new and used books! \nWe will also buy your books! Bring them in for us to take a look at during your next visit.");
            }

            if ((answer.contains("CARRY") && ((answer.contains("KIND") || (answer.contains("CARRY")))))) {
                System.out.println("We carry all kinds of books! \n"); // insert book list here
            }

            // still need title functionality

        } while (stop.equals("Y"));

        scan.close();
    }

}