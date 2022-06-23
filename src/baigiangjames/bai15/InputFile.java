package baigiangjames.bai15;

import java.io.FileNotFoundException;

public class InputFile {
    //cách 2: ném lỗi cho phương thức gọi đến phương thức chứa lỗi xử lý
    public void createFile() throws FileNotFoundException {
        //cách 1: xử lý lỗi tại phương thức
//        try {
//            throw new FileNotFoundException();
//        } catch (FileNotFoundException e) {
//            System.out.println("Hết lỗi");
//        }
        throw new FileNotFoundException();
    }
}
