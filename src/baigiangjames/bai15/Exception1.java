package baigiangjames.bai15;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------Nhập vào độ dài 3 cạnh để kiểm tra-------------");
        double a = 0;
        double b = 0;
        double c = 0;

        try {
            System.out.println("Nhập vào cạnh a: ");
            a = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("Nhập vào cạnh b: ");
            scanner.nextLine();
            b = scanner.nextDouble();
        } catch (Exception e1) {
            System.out.println(e1);
        }

        try {
            System.out.println("Nhập vào cạnh c: ");
            scanner.nextLine();
            c = scanner.nextDouble();
        } catch (Exception e2) {
            System.out.println(e2);
        }

        triangle(a, b, c);

    }

    public static void triangle(double a, double b, double c) {
        if ((a > 0 && b > 0 && c > 0) && (a + b > 0 && a + c > b && c + b > a)) {
            System.out.println("Đây là 1 tam giác");
        } else {
            System.out.println("Đây không phải là 1 tam giác");
        }

    }
}
