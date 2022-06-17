package baigiangjames.bai2;

public class DeclareClass {
    //các thuộc tính của lớp
    public String name;
    public int age;

    //hàm khởi tạo trong java là 1 phương thức không giá trị trả về
    //không có từ khóa void và có tên phương thức trùng tên class
    //tham số có thể là 0; có thể là tối đa số lượng thuộc tính
    //tiêu biểu trong cách triển khai overloading

    //constructor không tham số
    public DeclareClass() {
    }

    //constructor full tham số
    public DeclareClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //constructor với tham số tùy chọn
    public DeclareClass(String name) {
        this.name = name;
    }

    //getter & setter của các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //triển khai phương thức toString của lớp tổ tiên: Object
    @Override
    public String toString() {
        return "DeclareClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
