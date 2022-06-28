package baigiangjames.bai18;

public class MyThread extends Thread {
    private long check;

    public MyThread() {
    }

    public long getCheck() {
        return check;
    }

    @Override
    public void run() {
        while (true) {
            check = System.currentTimeMillis();
        }
    }
}
