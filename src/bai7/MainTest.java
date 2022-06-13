package bai7;

public class MainTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Chicken chicken = (Chicken) animal;
                Edible edible = (Edible) chicken;
//                Animal edible = (Animal) chicken;
                System.out.println(edible.howToEat());
            }
        }
    }
}
