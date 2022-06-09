package lythuyet;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car();
        Wheel wheel = new Wheel(80);
        Car car1 = new Car();
        car1.display(wheel);
//        int radius = car1.wheel.radius;
//        System.out.println(radius);
    }
}
