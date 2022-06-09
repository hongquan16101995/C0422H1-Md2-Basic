package oop.Abstraction.Interface;

//triển khai interface Language; dùng từ khóa implements
public class Human implements Language {
    @Override
    public void say() {
        System.out.println("Say somethings");
    }

    @Override
    public int sumNumber(int num1, int num2) {
        return num1 * num2;
    }
}
