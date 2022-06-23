package baigiangjames.bai15;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        do {
            try {
                a = Integer.parseInt(scanner.nextLine());
//                System.out.println(10 / 0);
//                int[] ints = {1, 2};
//                System.out.println(ints[100]);
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println("Lỗi nhập");
            } catch (Exception e2) {
                System.out.println("E3");
            }
            System.out.println(a * 100);
        }while (a != 0);
    }
}
