package baigiangjames.bai15;

import java.io.File;
import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int index = scanner.nextInt();
        int[] ints = new int[3];
//        System.out.println(ints[7]);
        try {
            System.out.println(ints[7]);
            System.out.println(10/0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
            System.out.println("Index không phù hợp");
        }
        System.out.println("Hello");
    }
}
