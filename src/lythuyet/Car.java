package lythuyet;

public class Car {
    public String name;
//    public Wheel wheel;

    public Car() {
    }

//    public Car(String name, Wheel wheel) {
//        this.name = name;
//        this.wheel = wheel;
//    }

    public void display(Wheel wheel) {
        System.out.println(wheel.radius);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
