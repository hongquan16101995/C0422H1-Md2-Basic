package btthem;

import java.util.Scanner;

public class MenuStaff {
    private static int index = 0;
    private static Staff[] arrayStaff;

    public static void main(String[] args) {

        createArrayStaff();
        System.out.println(arrayStaff.length);

        for (int i = 0; i < arrayStaff.length; i++) {
            Staff objectStaff = createNewStaff();
            addStaffInArrayStaff(objectStaff);
        }
        //dùng để hiện thị các object tồn tại trong mảng trước khi xóa
        for (Staff elementStaff : arrayStaff) {
            System.out.println(elementStaff);
        }

        deleteStaffByIndexInArray(3);

        //dùng để hiện thị các object tồn tại trong mảng sau khi xóa
        for (Staff elementStaff : arrayStaff) {
            System.out.println(elementStaff);
        }
    }

    public static void deleteStaffByIndexInArray(int index) {
        //tạo 1 mảng mới có số phần tử bằng số phần từ của mảng staff - 1
        //đẩy các phần tử trong staff và mảng mới, ngoại trừ phần tử ở vị trí index

        //cần phân biệt 3 chỉ số thường dùng để thao tác với đối tượng trong mảng
        //chỉ số 1: index - vị trí của phần tử trong mảng
        //chỉ số 2: vị trí xuất hiện trên mảng
        //chỉ số 3: id của đối tượng nếu có
        Staff[] newStaff = new Staff[arrayStaff.length - 1];
        for (int i = 0; i < arrayStaff.length - 1; i++){
            if (i < index) {
                newStaff[i] = arrayStaff[i];
            } else {
                newStaff[i] = arrayStaff[i + 1];
            }
        }
        arrayStaff = newStaff;
    }

    public static void createArrayStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào độ dài bạn muốn của mảng chứa Staff: ");
        int length = input.nextInt();
        arrayStaff = new Staff[length];
    }

    public static Staff createNewStaff() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên của Staff thứ " + (index + 1) + ": ");
        String name = input.nextLine();
        System.out.println("Nhập vào tuổi của Staff thứ " + (index + 1) + ": ");
        int age = input.nextInt();
        System.out.println("Nhập vào lương của Staff thứ " + (index + 1) + ": ");
        double salary = input.nextDouble();
        Staff newStaff = new Staff(name, age, salary);
        return newStaff;
    }

    public static void addStaffInArrayStaff(Staff newStaff) {
        arrayStaff[index] = newStaff;
        index = index + 1;
    }
}
