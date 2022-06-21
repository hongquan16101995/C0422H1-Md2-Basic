package baigiangjames.bai14;

public class ThuatToanSapXep {
    public static void main(String[] args) {
        int[] ints = {1,34,7,8,22,10,68,23,37,9,234,88};
//        bubbleSort(ints);
//        selectionSort(ints);
        insertionSort(ints);
        display(ints);
    }

    public static void bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] < ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int min = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[min] > ints[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = ints[i];
                ints[i] = ints[min];
                ints[min] = temp;
            }
        }
    }

    public static void insertionSort(int[] ints) {
        int value;
        int index;
        for (int i = 1; i < ints.length; i++) {
            value = ints[i];
            index = i;
            while (index > 0 && value < ints[index - 1]) {
                ints[index] = ints[index - 1];
                index--;
            }
            ints[index] = value;
        }
    }

    public static void display(int[] ints) {
        for (int i : ints) {
            System.out.print(i + "; ");
        }
    }
}
