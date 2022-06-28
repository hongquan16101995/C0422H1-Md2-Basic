package baigiangjames.bai18;

public class RunAndThread {
    public static void main(String[] args) {
        BasicThread basicThread = new BasicThread();
        BasicRun basicRun = new BasicRun();
        basicThread.start();
        basicRun.run();
    }
}
