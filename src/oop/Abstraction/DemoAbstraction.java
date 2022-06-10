package oop.Abstraction;

import oop.Abstraction.Abstract.People;
import oop.Abstraction.Interface.Animal;
import oop.Abstraction.Interface.Language;
import oop.Abstraction.Interface.Television;

import java.util.Scanner;

public class DemoAbstraction {
    public static void main(String[] args) {
        //không được khởi tạo đối tượng từ interface
//        Language language = new Language();

        //không được khởi tạo đối tượng từ abstract class
//        People people = new People();

        //các class bình thường khởi tạo bình thường
        Television television = new Television();
    }
}
