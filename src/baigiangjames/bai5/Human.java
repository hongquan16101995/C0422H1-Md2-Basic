package baigiangjames.bai5;

public class Human {
    private String name;
    private int age;
    private String gender;
    private String address;

    //overloading: nạp chồng phương thức
    //tạo ra các phương thức cùng tên, cùng kiểu dữ liệu trả về
    //khác nhau về số lượng hoặc kiểu dữ liệu của tham số phương thức
    //có thể thay đổi về access modifier của các phương thức
    public Human() {
    }

    public Human(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display(String a, int b){}
    public void display(int a, String b){}
    public void display(){
        System.out.println("HelloWorld");
    }
}
