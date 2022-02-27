//package general;

import java.util.Scanner;

public class DisplayCalendar {

    public static void main(String[] args) {
        int spaces = 0;
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("*** Enter the start day ****\n");
            System.out.print("press '0' to start the day from SUNDAY\n");
            System.out.print("press '1' to start the day from MONDAY\n");
            System.out.print("press '2' to start the day from TUESDAY\n");
            System.out.print("press '3' to start the day from WEDNESDAY\n");
            System.out.print("press '4' to start the day from THURSDAY\n");
            System.out.print("press '5' to start the day from FRIDAY\n");
            System.out.print("press '6' to start the day from SATURDAY\n");
            int j = sc.nextInt();
            System.out.print("Enter the number of days in a MONTH :  ");
            int d = sc.nextInt();
            System.out.println("_____________________________________");
            System.out.println("  Sun  Mon Tue  Wed  Thu  Fri  Sat");
            System.out.println("-------------------------------------");

            spaces = (j + spaces) % 7;

            // Loop for calendar
            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= d; i++) {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == d))
                    System.out.println();
            }

            System.out.println();
        }
    }
}