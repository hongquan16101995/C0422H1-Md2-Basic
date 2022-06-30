package baigiangjames.bai21.factory;

public class Main {
    public static void main(String[] args) {
        FactoryCar factoryCar = new FactoryCar();
        Car car = factoryCar.returnCar("BWM");
        System.out.println("Class Car: " + car.getName());
        System.out.println(factoryCar.returnCar("BWM").getName());
        System.out.println(factoryCar.returnCar("BWM").getClass());
        System.out.println(factoryCar.returnCar("Toyota").getName());
        System.out.println(factoryCar.returnCar("Toyota").getClass());
        System.out.println(factoryCar.returnCar("Honda").getName());
        System.out.println(factoryCar.returnCar("Honda").getClass());

        if (factoryCar.returnCar("Toyota") instanceof Toyota) {
            Toyota toyota = (Toyota) factoryCar.returnCar("Toyota");
            toyota.display();
        }
    }
}
