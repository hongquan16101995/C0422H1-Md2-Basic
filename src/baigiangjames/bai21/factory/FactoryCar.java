package baigiangjames.bai21.factory;

public class FactoryCar {
    public Car returnCar(String name) {
        switch (name) {
            case "BWM":
                return new BWM(name);
            case "Honda":
                return new Honda(name);
            case "Toyota":
                return new Toyota(name);
        }
        return null;
    }
}
