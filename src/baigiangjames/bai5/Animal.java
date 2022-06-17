package baigiangjames.bai5;

public class Animal {
    public String name;
    //thuộc tính/property đánh dấu là static
    public static int age = 10;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void totalAge() {
        //phương thức non-static không thể gọi được phương thức/thuộc tính static
//        age
    }

    public static void displayName() {
        //phương thức static không thể gọi được phương thức/thuộc tính non-static
//        name
    }

    //phương thức/method được đánh dấu là static
    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Animal.age = age;
    }
}
