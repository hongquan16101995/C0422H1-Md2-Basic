package baigiangjames.bai18;

public class BasicRun implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i < 50) {
            System.out.println("BasicRun: " + i);
            i++;
        }
    }
}
