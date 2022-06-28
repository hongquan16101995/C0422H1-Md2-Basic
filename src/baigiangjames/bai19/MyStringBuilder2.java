package baigiangjames.bai19;

public class MyStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abcd");
        //thêm 1 chuỗi vào cuối chuỗi có sẵn
        stringBuilder.append("e");
        //thêm 1 chuỗi vào cuối chuỗi có sẵn theo index được chỉ định
        stringBuilder.append("11xyz11", 2,5);
        System.out.println(stringBuilder);
        //xóa ký tự tại index được chọn
        stringBuilder.deleteCharAt(4);
        System.out.println(stringBuilder);
        //thêm 1 giá trị bất kỳ vào vị trí chỉ định
        stringBuilder.insert(4, true);
        System.out.println(stringBuilder);
        stringBuilder.insert(8,"false",0, 3);
        System.out.println(stringBuilder);
    }
}
