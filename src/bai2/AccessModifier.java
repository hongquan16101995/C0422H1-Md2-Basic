package bai2;

public class AccessModifier {
    public static void main(String[] args) {
        Dog dog = new Dog(10, 0.5, "Black", "John", 10);
        Dog dog1 = new Dog(12, 0.5, "Blue", "Hihi", 12);
        System.out.println(dog.getAge());
        System.out.println(dog1.getAge());
//        System.out.println(dog.height);
//        System.out.println(dog.weight);
//        System.out.println(dog.getColor());
    }
}


