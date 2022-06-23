package baigiangjames.bai16;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
    public static void main(String[] args) {
        File file = new File("demo1.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            //append: true: cho phép tiếp tục ghi dữ liệu vào file đã có sẵn
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("Hello World\nCodeGym C0422H1");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Không tạo được file!");
        }

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            //tạo 1 biến để chứa giá trị các ký tự khi đọc file
            int index;
            //dùng vòng lặp để duyệt qua tất cả các ký tự hiện có trong file
            while ((index = fileReader.read()) != -1) {
                System.out.print((char)index);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Không tìm thấy file!");
        }
    }
}
