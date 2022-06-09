package oop.Abstraction.Abstract;

//có thể kế thừa abstract class như các class bình thường khác
public class Employee extends People{
    @Override
    public void eat() {

    }

    @Override
    public void run() {
        super.run();
    }
}
