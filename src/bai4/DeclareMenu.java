package bai4;

import java.util.Scanner;

public class DeclareMenu {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager(10);
        Scanner scanner = new Scanner(System.in);
        int choice;

        //sử dụng do...while để lặp lại yêu cầu menu
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm Student");
            System.out.println("2. Sửa thông tin Student");
            System.out.println("3. Xóa Student");
            System.out.println("4. Hiển thị thông tin Student");
            System.out.println("0. Thoát");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManager.addStudent(scanner);
                    break;
                case 2:
                    studentManager.updateStudent();
                    break;
                case 3:
                    studentManager.deleteStudent();
                    break;
                case 4:
                    studentManager.display();
                    break;
            }
            System.out.println("-------------------------");
        }while (choice != 0);
    }
}
