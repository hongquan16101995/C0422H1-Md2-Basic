package oop.Inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Quân", 26, "Male");
        student.setAge(10);
//        System.out.println(student.getAge());

        Human human = new Human("Quân", 26, "Male");
        Student student2 = new Student("Thắng", 20, "Male", 20);
        System.out.println(student2.getAveragePoint());
        System.out.println(human.getAge());
    }
}
