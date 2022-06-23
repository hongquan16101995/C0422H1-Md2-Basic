package baigiangjames.bai16;

import java.io.*;

public class FileBuffer {
    public static void main(String[] args) {
        File file = new File("demo2.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("HelloWorld\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Không tạo được file!");
        }

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String index;
            while ((index = bufferedReader.readLine()) != null) {
                System.out.println(index);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Không tìm thấy file!");
        }
    }
}
