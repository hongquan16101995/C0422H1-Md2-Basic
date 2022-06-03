package bai2;

public class Demo {
    public static void main(String[] args) {
        //lưu ý đặt dấu chấm phẩy đúng chỗ
        for (int i = 0; i < 20; i++); {
            System.out.println("C04");
        }

        int[] array = {1,2,3,4};
        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
        }

        a:
        for (int i = 0; i < 10; i++) {
            b:
            for (int j = 0; j < 20; j++) {
                if (j == 10) {
                    break a;
                }
                System.out.println(j);
            }
        }

        // (<kiểu dữ liệu> <tên biến chạy> : <tên mảng cần duyệt>)
        // trả về là giá trị phần tử
        for (int element : array) {
//            System.out.println(element);
        }
    }
}
