package oop.Encapsulation;

public class Demo {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(1, 2, 3, 4);
        System.out.println(superClass.propertyTwo);
        System.out.println(superClass.propertyThree);
        System.out.println(superClass.propertyFour);
    }
}
