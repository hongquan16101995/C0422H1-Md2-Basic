package bai3;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 3, 4, 6, 6, 3, 67, 3, 7, 3, 7, 3};
        // 1,2,4,3,6,0
        // 1,2,4,6,0,0
        // newArray = 1,2,3,4,6,0 => i = 2 => i = 3
        int value = 3;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) {
                for (int j = i; j < ints.length - 1; j++) {
                    ints[j] = ints[j + 1];
                }
//                display(ints);
                ints[ints.length - 1] = 0;
                i--;
            }
        }
        display(ints);
    }

    //tạo phương thức hiển thị
    public static void display(int[] array) {
        for (int e : array) {
            System.out.print(e + ";");
        }
        System.out.println();
    }
}
