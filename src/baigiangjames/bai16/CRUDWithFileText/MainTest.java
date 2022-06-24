package baigiangjames.bai16.CRUDWithFileText;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm 1 học viên");
            System.out.println("2. Sửa 1 học viên");
            System.out.println("3. Xóa 1 học viên");
            System.out.println("4. Ghi file");
            System.out.println("5. Đọc file");
            System.out.println("6. Hiển thị");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.updateById();
                    break;
                case 3:
                    studentManager.deleteById();
                    break;
                case 4:
                    studentManager.writeFile();
                    break;
                case 5:
                    studentManager.readFile();
                    break;
                case 6:
                    studentManager.display();
                    break;
            }
        } while (choice != 0);
    }
}
