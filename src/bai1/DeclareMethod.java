package bai1;

public class DeclareMethod {
    public static void main(String[] args) {
        int []b = {1,2,3};
        //gọi phương thức method1
        method1(1, b);
        //gọi phương thức method2
        System.out.println(method2());
    }

    //phương thức không giá trị trả về: void
    //khai báo rõ ràng kiểu dữ liệu của tham số
    public static void method1(int a, int[] b) {
        //a[0] = 1;
        b[0] = 10;
    }

    //phương thức có giá trị trả về: datatype return
    //ví dụ: trả về double
    public static double method2() {
        return 0.1;
    }
}
