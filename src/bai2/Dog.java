package bai2;

public class Dog {
    public int weight;
    public double height;
    private String color;
    protected String name;
    int age = 10;

    //hàm khởi tạo trong java là 1 phương thức không giá trị trả về
    //không có từ khóa void và có tên phương thức trùng tên class
    //tham số có thể là 0; có thể là tối đa số lượng thuộc tính

    //constructor không tham số
    public Dog() {
    }

    public Dog(int weight, double height, String color, String name) {
        this.weight = weight;
        this.height = height;
        this.color = color;
        this.name = name;
    }

    //constructor full tham số
    public Dog(int weight, double height, String color, String name, int age) {
        this.weight = weight;
        this.height = height;
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public Dog(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
