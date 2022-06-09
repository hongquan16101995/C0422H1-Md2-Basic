package oop.Abstraction.Abstract;

//cách khởi tạo 1 lớp trừu tượng: thêm từ khóa abstrac trước class
public abstract class People {
    //các thuộc tính khởi tạo như bt
    public int a;

    //chứa được các phương thức abstract
    public abstract void eat();

    //chứa được các phương thức non-abstract
    public void run(){};
}
