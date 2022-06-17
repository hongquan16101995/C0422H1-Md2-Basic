package baigiangjames.bai3;

public class ArrayMethod {
    public static void main(String[] args) {
        int[] ints = {1, 2, 4};
        int[] ints1 = ints.clone();
        //tạo 1 bản sao giống hệt mảng cũ
        System.out.println(ints == ints1);
        //in hashCode() của 2 mảng
        System.out.println(ints1);
        System.out.println(ints);
        //duyệt mảng
        for (int a : ints1) {
            System.out.print(a + ",");
        }
    }
}
