package baigiangjames.bai18.ThreadAndMethod;

public class Thread2 extends Thread{
    private Print print;

    public Thread2(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        try {
            print.display("Thread-2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
