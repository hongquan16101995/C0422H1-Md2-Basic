package bai12;

import java.util.ArrayList;
import java.util.Collections;

//comparable sẽ cần triển khai cho các lớp cần sắp xếp
public class Circle implements Comparable<Circle>{
    private int radius;
    private int age;
    private int x;

    public Circle(int radius, int age, int x) {
        this.radius = radius;
        this.age = age;
        this.x = x;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", age=" + age +
                ", x=" + x +
                '}';
    }

    @Override
    public int compareTo(Circle o) {
        if (o.radius - this.radius == 0) {
            if (o.age - this.age == 0) {
                return o.x - this.x;
            }
            return o.age - this.age;
        }
        return o.radius - this.radius;
    }

    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        Circle circle1 = new Circle(30, 1, 30);
        Circle circle2 = new Circle(10,2, 30);
        Circle circle3 = new Circle(20,2, 20);
        Circle circle4 = new Circle(20,3,10);
        Circle circle5 = new Circle(20,3,60);

        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);
        circles.add(circle5);

        System.out.println(circles);
        Collections.sort(circles);
        System.out.println(circles);

    }
}
