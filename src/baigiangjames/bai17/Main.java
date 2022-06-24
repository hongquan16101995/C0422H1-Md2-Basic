package baigiangjames.bai17;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("demo");
        file.createNewFile();
//        try {
            InputStream is = System.in;
            while (true) {
                System.out.print("Nhập 1 ký tự: ");
                int ch = is.read();
                if (ch == 'q') {
                    System.out.println("Finished!");
                    break;
                }
                try {
                    is.skip(2);
                } catch (IOException e) {
                    System.out.println();
                }
                 // Loại bỏ 2 ký tự \r và \n
                System.out.println("Ký tự nhận được: " + (char) ch);
            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
