package bai1;

public class DeclareArray {
    public static void main(String[] args) {
        //khai báo mảng literal
        int [] arr = {1,2,3};
        //khai báo mảng rỗng
        int [] array = new int[]{};
        //khai báo mảng với số lượng phần tử trong mảng
        int [] array1 = new int[3];
        //khai báo mảng với các phần tử cụ thể
        int [] array2 = new int[]{50,45, 40};
        //khai báo mảng 2 chiều rỗng
        //có thể viết int array3 [][] hoặc khai báo new int[5][]
        int [][] array3 = new int[][]{};

        //duyệt mảng sử dụng forEach
        for (int element : array2) {
            System.out.println("Phần tử thứ của array2: " + element);
        }

        //duyệt mảng với for thường; không còn for...in, for...of
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        //tạo mảng mới với length nhân đôi
        int[] arrayNew = new int[array1.length*2];
        System.out.println(array1.length);
        System.out.println(arrayNew.length);

        //gán giá trị tại index thứ 2
        array1[2] = 100;
        System.out.println(array1[2]);
        //lỗi index: ArrayIndexOutOfBounce
        array1[10] = 10;
        System.out.println(array1[10]);
    }
}
