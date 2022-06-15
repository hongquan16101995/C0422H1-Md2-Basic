package bai10;

//lớp ArrayList thuộc về gói java.util (import package)
import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {
        //khởi tạo 1 danh sách chứa Integer; mặc định theo Java có 10 phần tử
        //từ Java 7, phần Generic phía sau không cần viết
        //Generic là phần quy định kiểu dữ liệu cho các Collection
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Integer a = 1;
        arrayList.add(a);
        arrayList.add(100);
        arrayList1.add(1000);
        arrayList1.add(2000);
        arrayList.addAll(arrayList1);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        //khởi tạo 1 mảng Integer có 10 phần tử
        Integer[] integers = new Integer[10];
    }
}
