package oop.Inheritance.encapsulation;

import oop.Encapsulation.SuperClass;

public class DemoEncapsulation {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(1,2,3,4);
        System.out.println(superClass.propertyFour);
        SubClass subClass = new SubClass();
        System.out.println(subClass.propertyFour);
    }
}
