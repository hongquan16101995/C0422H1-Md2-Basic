package oop.Polymorphism;

public class DemoCasting {
    public static void main(String[] args) {
        //kiểu dữ liệu của biến gọi là kiểu tham chiếu của biến
        //kiểu dữ liệu của đối tượng được khởi tạo là kiểu khởi tạo của biến
        Human human = new Human();
        Staff staff = new Staff();

        //thực hiện upcasting 1 đối tượng lớp con thành lớp cha
        Human humanUpCasting = (Human) staff;

        //khai báo 1 đối tượng là lớp cha; kiểu khởi tạo là lớp con
        Human humanCasting = new Staff();

        //thực hiện downcasting 1 đối tượng lớp cha về lớp con
        //thành công vì kiểu khởi tạo thực tế của lớp cha là lớp con
        Staff staffDownCasting = (Staff) humanCasting;

        //Exception: ClassCastException
        //xảy ra lỗi khi downcasting về lớp con
        //do kiểu khởi tạo của human là lớp cha
        Staff staff2 = (Staff) human;
    }
}
