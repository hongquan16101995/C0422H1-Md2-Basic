package oop.Encapsulation;

//4 level của access: public, protected, default, private
//3 access: public, protected, private
//public: được phép truy cập trong toàn bộ dự án
//protected: truy cập trong package, ngoài package nhưng phải là class con
//default: truy cập trong package
//private: truy cập trong class
public class SuperClass {
    private int propertyOne;
    int propertyTwo;
    protected int propertyThree;
    public int propertyFour;

    public SuperClass() {
    }

    public SuperClass(int propertyOne, int propertyTwo, int propertyThree, int propertyFour) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
        this.propertyFour = propertyFour;
    }

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(1, 2, 3, 4);
        System.out.println(superClass.propertyOne);
    }
}
