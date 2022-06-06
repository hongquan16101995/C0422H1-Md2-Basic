package common;

public class ToolArray {
    public static int[] push(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        return newArray;
    }

    public static int[] pop(int[] array) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        return newArray;
    }

    public static int[] unshift(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 1, array.length);
        newArray[0] = value;
        return newArray;
    }

    public static int[] shift(int[] array) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, newArray.length);
        return newArray;
    }

    public static String join(int[] array, String value) {
        String values = "";
        for (int element : array) {
            values += element;
            values += value;
        }
        values = values.substring(0, values.length()-value.length());
        return values;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i -1] = temp;
        }
    }

    public static int[] concat(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i > array1.length - 1) {
                newArray[i] = array2[i - array1.length];
            } else {
                newArray[i] = array1[i];
            }
        }
        return newArray;
    }

    public static void sortUp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortDown(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int[] slice() {
        return null;
    }

    public static int[] splice() {
        return null;
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(int[] array, int value) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static String toString(int[] array) {
        String value = "";
        for (int element : array) {
            value += element;
        }
        return value;
    }
}
