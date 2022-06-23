package baigiangjames.bai15;

import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) throws FileNotFoundException{
//        try {
////            int[] ints = {1,2};
////            System.out.println(ints[100]);
//            System.out.println(10/0);
//        } catch (ArithmeticException e) {
//            System.out.println("Không có phép chia cho 0");
//        } finally {
//            System.out.println(100*100);
//            System.out.println("Luôn thực thi");
//        }
        System.out.println(getEx());

        InputFile inputFile = new InputFile();
        inputFile.createFile();
//        try {
//            inputFile.createFile();
//        } catch (FileNotFoundException e) {
//            System.out.println("Hết lỗi");
//        }
    }

    public static String getEx() {
        try {
//            int[] ints = {1,2};
//            System.out.println(ints[100]);
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Không có phép chia cho 0");
//            return "HelloWorld";
            System.exit(0);
        } finally {
            System.out.println(100*100);
            System.out.println("Luôn thực thi");
        }
        return "Bye";
    }
}
