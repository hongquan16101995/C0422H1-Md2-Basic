package oop.Abstraction.Interface;

//đánh dấu 1 interface bằng từ khóa interface
public interface Language {
    //các thuộc tính trong interface là hằng số; dạng final static
    int a = 1;
    //các phương thức trong interface phải là public + abstract
    //phương thức trong interface luôn luôn không có phần thân
    //gọi là phương thức abstract hay phương thức trừu tượng
    //mặc định của interface là public abstract; chỉ cần tên phương thức và ngoặc tròn là đủ
    public abstract void say();
    int sumNumber(int num1, int num2);

    //không chứa các phương thức non-abstract
    //public void run(){};
}
