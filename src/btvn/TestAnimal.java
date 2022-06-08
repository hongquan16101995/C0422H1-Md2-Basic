package btvn;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");

        int length = Integer.parseInt(scanner.nextLine());
        //length = 5 => animals = {null,null,null,null,null}
        //animals = {Object, Object, Object, Object}
        //giá trị mặc định của object nếu không khởi tạo là null
        Animal[] animals = createAnimalArray(length);

        //cách 2: dùng for: hoặc để điều kiện i < 3
        //hoặc dùng length nhưng check điều kiện để break
        for (int i = 0; i < animals.length; i++) {
            if (i == 1) {
                break;
            }
            animals[i] = createAnimal(scanner);
        }
//        //cách 1: dùng trực tiếp 3 vị trí của mảng
//        animals[0] = createAnimal(scanner);
//        animals[1] = createAnimal(scanner);
//        animals[2] = createAnimal(scanner);
        display(animals);
    }

    public static Animal[] createAnimalArray(int length) {
        Animal[] animals = new Animal[length];
        return  animals;
    }

    public static void display(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            } else {
                System.out.println("Nó null đấy");
            }
        }
    }

    public static Animal createAnimal(Scanner scanner) {
        System.out.println("Enter weight:");
        int weight = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter height:");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter color:");
        String color = scanner.nextLine();
        Animal animal = new Animal(weight, height, gender, color);
        return animal;
    }
}
