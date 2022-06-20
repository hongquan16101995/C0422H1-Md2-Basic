package baigiangjames.bai13;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanTimKiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = {1, 8, 3, 25, 7, 24, 667, 5, 6};
        System.out.println("Nhập vào số muốn tìm:");
        int value = scanner.nextInt();

        Arrays.sort(ints);
        display(ints);
        System.out.println();
//        searchLinear(ints, value);
//        searchBinary(ints, value);
        searchBinary2(ints, value, 0, ints.length - 1);

    }

    public static void searchLinear(int[] ints, int value) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) {
                System.out.println("Vị trí của value là: " + i);
                break;
            }
        }
    }

    public static void searchBinary(int[] ints, int value) {
        int low = 0;
        int high = ints.length - 1;

        while (low <= high) {
            int mid = ((high + low) / 2);
            if (ints[mid] == value) {
                System.out.println("Vị trí của value là: " + mid);
                break;
            } else if (ints[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    public static void searchBinary2(int[] ints, int value, int low, int high) {
        int mid = ((high + low) / 2);
        if (ints[mid] == value) {
            System.out.println("Vị trí của value là: " + mid);
        } else if (ints[mid] < value) {
            searchBinary2(ints, value, mid + 1, high);
        } else {
            searchBinary2(ints, value, low, mid - 1);
        }
    }

    public static void display(int[] ints) {
        for (int s : ints) {
            System.out.print(s + "; ");
        }
    }
}
