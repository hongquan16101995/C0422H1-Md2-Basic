package bai2;

public class ArrayDouble {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int[][] arr = {{1,2,3},{2,4,6}};
        array[1][1] = 100;
        System.out.println(array[0][0]);
        System.out.println(array[1][1]);
    }
}
