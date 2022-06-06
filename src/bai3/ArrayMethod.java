package bai3;

public class ArrayMethod {
    public static void main(String[] args) {
        int[] ints = {1,2,4};
        int[] ints1 = ints.clone();
        System.out.println(ints == ints1);
        System.out.println();
        System.out.println(ints1);
        System.out.println(ints);
        for (int a: ints1) {
            System.out.print(a + ",");
        }

        int [][]ints2 = new int[][]{};
    }
}
