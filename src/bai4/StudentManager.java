package bai4;

import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int[] studentAge;
    private static int index = 0;

    public StudentManager(int size) {
        this.students = new Student[size];
    }

    public void addStudent(Scanner scanner) {
        Student student = createStudent(scanner);
        students[index] = student;
        index++;
    }

    private Student createStudent(Scanner scanner) {
        System.out.println("Nhập tên học viên: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học viên: ");
        int age = scanner.nextInt();
        System.out.println("Nhập giới tính học viên: ");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        double avg = scanner.nextDouble();
        return new Student(name, age, gender, avg);
    }

    public void deleteStudent() {
//        students[index] = null;
        System.out.println("Đây là phương thức xóa Student");

    }

    public void updateStudent() {
        System.out.println("Đây là phương thức sửa Student");
    }

    public void display() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
