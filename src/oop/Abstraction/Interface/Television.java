package oop.Abstraction.Interface;

//triển khai interface Language; dùng từ khóa implements
public class Television implements Language{
    @Override
    public void say() {
        System.out.println("........");
    }

    @Override
    public int sumNumber(int num1, int num2) {
        return num1 + num2;
    }
}
