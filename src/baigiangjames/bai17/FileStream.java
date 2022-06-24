package baigiangjames.bai17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write('a');
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Lỗi");
        }

        try {
            File file = new File("test.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println((char)fileInputStream.read());;
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Lỗi");
        }
    }
}
