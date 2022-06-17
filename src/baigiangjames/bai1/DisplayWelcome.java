package baigiangjames.bai1;

import java.util.Scanner;

public class DisplayWelcome {
    public static void main(String[] args) {
        //cách nhập vào giá trị từ console
        Scanner scanner = new Scanner(System.in);

        //lấy giá trị chuỗi (sau enter)
        System.out.println("Nhập vào 1 từ bất kỳ: ");
        String welcome = scanner.nextLine();
        System.out.println(welcome);

        //lấy giá trị số nguyên int; nếu là long thì là nextLong()
        System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
        int number = scanner.nextInt();
        System.out.println(number);

        //lấy giá trị số thập phân; nếu là float thì là nextFloat()
        System.out.println("Nhập vào 1 số thập phân bất kỳ: ");
        double numberDouble = scanner.nextDouble();
        System.out.println(numberDouble);

        //lấy giá trị byte
        System.out.println("Nhập vào 1 giá trị byte bất kỳ: ");
        byte numberByte = scanner.nextByte();
        System.out.println(numberByte);

        // in trong cùng 1 dòng" print
        System.out.print("HelloWorld CodeGym");
        // \n để xuống dòng trong 1 chuỗi string
        System.out.print("HelloWorld\n+CodeGym");
        //in xong thì xuống dòng: println
        System.out.println();
        System.out.println("HelloWorld");
        System.out.println("CodeGym");
        //in với print format: tìm hiểu thêm
        System.out.printf("%-30s%s","HelloWorld", "CodeGym");

        //string, char
        //byte, short, int, long, float, double
        //boolean: true/false
        //bit: 1 0
        //phân biệt cách khai báo string và char
        char a = 'a';
        String b = "a";
    }
}
