package bai12;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
