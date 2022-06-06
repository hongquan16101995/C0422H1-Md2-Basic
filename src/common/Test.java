package common;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,5,8,3,2,7,9,4,5,10};
        int[] arr1 = {2,7,9,4};
//        int[] newArr = ToolArray.pop(arr);
//        int[] newArr = ToolArray.push(arr, 100);
//        int[] newArr = ToolArray.shift(arr);
//        int[] newArr = ToolArray.unshift(arr, 100);
//        int[] newArr = ToolArray.concat(arr, arr1);
        String value = ToolArray.join(arr, "--");
//        String value = ToolArray.toString(arr);
        System.out.println(value);
//        ToolArray.reverse(arr);
//        ToolArray.sortUp(arr);
//        ToolArray.sortDown(arr);
        for(int element : arr) {
            System.out.print(element);
            System.out.print("; ");
        }
    }
}
