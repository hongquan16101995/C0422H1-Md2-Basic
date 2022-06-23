package baigiangjames.bai16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOFile {
    public static void main(String[] args) {
        //tạo 1 đối tượng file để thao tác với file có tên là demo.txt
        File file = new File("demo.txt");
        //khối try catch để bắt lỗi cho IO
        //try-with-resource: dùng để đóng tài nguyên với khối try
//        try (PrintWriter printWriter = new PrintWriter(file)) {
        try {
            //phương thức exists để kiểm tra file đã tồn tại hay chưa
            //trả về true nếu file đã tồn tại
            if (!file.exists()) {
                file.createNewFile();
            }
            //lớp để ghi dữ liệu sang file text
            //tự động xóa dữ liệu trong file trước khi ghi
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("Hello");
            printWriter.println("World");
            printWriter.println("C0422H1");
            printWriter.println("Quân");
            printWriter.print("CodeGym");
            //dùng để đóng luồng ghi
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Không tạo được file!");
        }

        //đọc file sử dụng Scanner
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }catch (IOException e) {
            System.out.println("Không tìm thấy file!");
        }
    }
}
