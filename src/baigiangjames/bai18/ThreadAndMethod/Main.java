package baigiangjames.bai18.ThreadAndMethod;

public class Main {
    public static void main(String[] args) {
        Print print = new Print();
        Thread1 thread1 = new Thread1(print);
        Thread2 thread2 = new Thread2(print);
        thread1.start();
        thread2.start();
    }
}
