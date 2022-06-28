package baigiangjames.bai18.ThreadAndMethod;

public class Print {
      synchronized public void display(String name) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            Thread.sleep(500);
            System.out.println(name + " :" + i);
        }
    }
}
