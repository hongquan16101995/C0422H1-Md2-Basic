package bai6;

import btvn.Animal;

public class DemoWrapper {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("Abc");
        //StringBuilder và StringBuffer
        //lớp Wrapper: cung cấp thêm các phương thức để thao tác với đối tượng
        //int => Integer
        //float => Float
        Integer integer = 10;
        Integer integer1 = new Integer(10);

        //final: đánh dấu hằng số; giá trị của hằng số không thay đổi
        final int number = 10;

        //đánh dấu biến tham chiếu đến đối tượng Animal là hằng số
        //đường dẫn từ biến animal đến đối tượng Animal không đổi
        //các thuộc tính của đối tượng Animal đổi như bình thường
        final Animal animal = new Animal(1,1,"a","a");
        Animal animal1 = new Animal(2,2,"b","b");
        Animal animal2 = new Animal(3,3,"c","c");

        //biến tham chiếu không final được gán lại như bình thường
        animal1 = animal2;

        //không gán lại tham chiếu được vì đã được đánh dấu final
//        animal = animal2;

        //các thuộc tính của đối tượng vẫn được phép thay đổi
        animal.setColor("black");
        System.out.println(animal.getColor());
    }
}
