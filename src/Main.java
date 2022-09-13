import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leapYear = new Scanner (System.in);
        System.out.println("Please enter a year to see if its a leapyear");

        double input = leapYear.nextInt();
        leapYear.nextLine();

        boolean isEven = input % 4 == 0;

        if ( isEven ) {
            System.out.println("% 4");
            System.out.println("Its a leapyear");
        }
         else {
            System.out.println("Its not a leapyear");
        }
    }
}