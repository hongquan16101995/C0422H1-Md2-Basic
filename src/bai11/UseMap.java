package bai11;

import java.util.HashMap;

public class UseMap {
    public static void main(String[] args) {
        //map là 1 cấu trúc dữ liệu dạng entry
        //mỗi entry có 2 giá trị là: key và value
        //key là giá trị không trùng lặp
        //value là giá trị có thể trùng lặp
        //truy xuất value thông qua key
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Quân");
        hashMap.put(4, "Chiến");
        hashMap.put(3, "Phương");
        hashMap.put(4, "Hà");
        hashMap.put(5, "Hà");
        hashMap.put(6, "Quân");
        System.out.println(hashMap.get(4));
        System.out.println(hashMap);

        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("hello", "xin chào");
        hashMap1.put("apple", "táo");
        hashMap1.put("orange", "cam");
        hashMap1.put("bye", "tạm biệt");
//        hashMap1.put("orange", "hihihi");
        System.out.println(hashMap1.get("bye"));
        System.out.println(hashMap1);
    }
}
