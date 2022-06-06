package oop.Inheritance.encapsulation;

import oop.Encapsulation.SuperClass;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(1, 2, 3, 4);
        System.out.println(superClass.propertyFour);
//        System.out.println(superClass.propertyThree);
//        System.out.println(superClass.propertyTwo);
        SubClass subClass = new SubClass();
        System.out.println(subClass.propertyThree);
        System.out.println(subClass.propertyFour);
    }

    public void testAccess() {
        int b = super.propertyThree;
        int c = super.propertyFour;
    }
}
