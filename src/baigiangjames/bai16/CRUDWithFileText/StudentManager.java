package baigiangjames.bai16.CRUDWithFileText;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent() {
        Student student = createStudent();
        students.add(student);
    }

    public Student createStudent() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        return new Student(name, age, address);
    }

    public void updateById() {
        System.out.println("Nhập Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checkId = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                Student studentUpdate = students.get(i);
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi mới: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập địa chỉ mới: ");
                String address = scanner.nextLine();
                studentUpdate.setName(name);
                studentUpdate.setAge(age);
                studentUpdate.setAddress(address);
                students.set(i, studentUpdate);
                checkId = true;
            }
        }
        if (!checkId) {
            System.out.println("Id không tồn tại!");
        }
    }

    public void deleteById() {
        System.out.println("Nhập Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checkId = false;
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                checkId = true;
            }
        }
        if (!checkId) {
            System.out.println("Id không tồn tại!");
        }
    }

    public void writeFile() {
        try {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\Theory\\C0422H1\\Module2\\C0422H1-Md2\\src\\baigiangjames\\bai16\\CRUDWithFileText\\student.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Student student : students) {
                bufferedWriter.write(student.getId() + "," + student.getName()
                        + "," + student.getAge() + "," + student.getAddress() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi!");
        }
    }

    public void readFile() {
        ArrayList<Student> studentRead = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\Theory\\C0422H1\\Module2\\C0422H1-Md2\\src\\baigiangjames\\bai16\\CRUDWithFileText\\student.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(",");
                Student student = new Student(Integer.parseInt(strings[0]),strings[1],
                        Integer.parseInt(strings[2]), strings[3]);
                studentRead.add(student);
            }
            bufferedReader.close();
            students = studentRead;
        } catch (IOException e) {
            System.out.println("Lỗi!");
        }
    }

    public void display() {
        for (Student student : students) {
            student.display();
        }
    }
}
