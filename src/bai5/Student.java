package bai5;

public class Student extends Human{
    //overriding: là ghi đè phương thức của lớp cha, xảy ra trong qhe kế thừa
    //access chỉ được phép bằng hoặc mở rộng hơn phương thức của cha
    //các thông số khác giữ nguyên, hầu hết chỉ thay đổi phần thân phương thức
    @Override
    public void display() {
       int a = 100;
       int b = 100;
        System.out.println(a * b);
    }
}
