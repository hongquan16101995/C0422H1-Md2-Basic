package baigiangjames.bai18;

import java.util.Scanner;

public class DouThread {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        int choice;
        do {
            System.out.println("Gõ enter:");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 5) {
                myThread1.suspend();
            }
            if (choice == 10) {
                myThread2.stop();
            }

            if (choice == 50) {
                myThread1.resume();
            }
            System.out.println(myThread1.getName() + ": " + myThread1.getCheck());
            System.out.println(myThread2.getName() + ": " + myThread2.getCheck());
        } while (choice != 0);
    }
}
