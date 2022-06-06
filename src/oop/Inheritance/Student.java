package oop.Inheritance;

// kế thừa: 1 class mới kế thừa từ 1 class đã có sẵn
// class kế thừa còn gọi là subclass (class con): CON LUÔN LUÔN MỞ RỘNG HƠN CHA
// class cho kế thừa còn gọi là superclass (class cha)
// khi kế thừa; con sẽ được thừa hưởng tất cả các thuộc tính và phương thức của cha
// trừ các thành phần ở dang private của cha
// từ khóa kế thừa: extends; cú pháp: <tên class con> extends <tên class cha>
// Java chỉ chấp nhận đơn kế thừa; tránh trạng thái kim cương
// Không thể kế thừa constructor

public class Student extends Human{
    public double averagePoint;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Student(String name, int age, String gender, double averagePoint) {
        super(name, age, gender);
        this.averagePoint = averagePoint;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }
}
