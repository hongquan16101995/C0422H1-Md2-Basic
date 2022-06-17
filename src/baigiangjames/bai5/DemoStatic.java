package baigiangjames.bai5;

public class DemoStatic {
    static {
        System.out.println("HelloWorld");
    }

    public static void main(String[] args) {
        //các thành phần được đánh dấu static thuộc về lớp
        //Animal.name; //không gọi được trực tiếp từ lớp
        Animal animal = new Animal("Dog");
        Animal animal1 = new Animal("Cat");
        Animal animal2 = new Animal("Fish");
        animal.setAge(20);
        System.out.println(animal.name);
        System.out.println(Animal.age);
        System.out.println(Animal.getAge());
        System.out.println(animal.age);
        System.out.println(animal1.age);
        System.out.println(animal2.age);
    }
}
