//Question 10 | Amarjeet kumar singh | Roll no: 202002021073
import java.io.*;
import java.util.Scanner;
public class Q10{
    static class Date {
        int day, month, year;
        int MAX_VALID_YR = 9999;
        int MIN_VALID_YR = 1800;

        Date() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the day: ");
            this.day = scan.nextInt();
            System.out.print("Enter the month: ");
            this.month = scan.nextInt();
            System.out.print("Enter the year: ");
            this.year = scan.nextInt();
            scan.close();
        }

        String getDate() {
            if (isValid()) {
                return day + "/" + month + "/" + year;
            } else return "Please enter a valid date.";
        }

        boolean isLeap(int year)
        {
            return (((year % 4 == 0) &&
                     (year % 100 != 0)) ||
                     (year % 400 == 0));
        }

        boolean isValid() {
          
            if (year > MAX_VALID_YR ||
            year < MIN_VALID_YR)
            return false;
        if (month < 1 || month > 12)
            return false;
        if (day < 1 || day > 31)
            return false;

        if (month == 2)
        {
            if (isLeap(year))
                return (day <= 29);
            else
                return (day <= 28);
        }
        if (month == 4 || month == 6 ||
            month == 9 || month == 11)
            return (day <= 30);
 
        return true;

        }
    }
        public static void main(String[] args) {
            Date d1= new Date();
            System.out.println(d1.getDate());
        }
    }