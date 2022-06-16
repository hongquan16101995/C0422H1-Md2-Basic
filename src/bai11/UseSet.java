package bai11;

import java.util.HashSet;

public class UseSet {
    public static void main(String[] args) {
        //set là cấu trúc dữ liệu
        //trong set chứa các giá trị không trùng lặp
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);
        System.out.println(hashSet);
    }
}
