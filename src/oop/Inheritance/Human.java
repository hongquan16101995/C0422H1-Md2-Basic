package oop.Inheritance;

public class Human {
    public String name;
    public int age;
    public String gender;

    // cần constructor không tham số để kế thừa
    // 1 class trong java, nếu không có constructor được khởi tạo
    // sẽ mặc định có 1 constructor không tham số
    public Human() {
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
