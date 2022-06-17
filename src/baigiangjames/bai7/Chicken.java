package baigiangjames.bai7;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Ò Ó O";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
