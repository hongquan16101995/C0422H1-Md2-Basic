package baigiangjames.bai18;

public class BasicThread extends Thread {
    public BasicThread() {
    }

    @Override
    public void run() {
        int i = 1;
        while (i < 50) {
            System.out.println("BasicThread: " + i);
            i++;
        }
    }
}
