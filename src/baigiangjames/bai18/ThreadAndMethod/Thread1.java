package baigiangjames.bai18.ThreadAndMethod;

public class Thread1 extends Thread{
    private Print print;

    public Thread1(Print print) {
        this.print = print;
    }

    @Override
    public void run() {
        try {
            print.display("Thread-1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
