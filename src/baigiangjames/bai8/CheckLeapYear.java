package baigiangjames.bai8;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        boolean checkLeapYear = isLeapYear(year);
        displayLeapYear(checkLeapYear);
    }

    private static boolean isLeapYear(int year) {
        boolean isDivisibleByFour = (year % 4 == 0);
        boolean isDivisibleByOneHundred = (year % 100 == 0);
        boolean isDivisibleByFourHundred = (year % 400 == 0);
        if (isDivisibleByFour) {
            if (isDivisibleByOneHundred) {
                return isDivisibleByFourHundred;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    private static void displayLeapYear(boolean checkLeapYear) {
        if (checkLeapYear) {
            System.out.println("Is leap year");
        } else {
            System.out.println("Not is leap year");
        }
    }
}
