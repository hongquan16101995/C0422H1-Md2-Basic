package baigiangjames.bai12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//không cần thiết triển khai Comparator
public class Square {
    private int side;
    private int age;
    private String name;

    public Square(int side, int age, String name) {
        this.side = side;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Square> squares = new ArrayList<>();
        Square square1 = new Square(20, 10, "apple");
        Square square2 = new Square(10, 20, "abple");
        Square square3 = new Square(30, 30, "orang");
        Square square4 = new Square(20, 5, "hhhhh");
        squares.add(square1);
        squares.add(square2);
        squares.add(square3);
        squares.add(square4);
        System.out.println(squares);

        Collections.sort(squares, new Comparator<Square>() {
            @Override
            public int compare(Square o1, Square o2) {
                return o1.side - o2.side;
            }
        });

        Collections.sort(squares, new Comparator<Square>() {
            @Override
            public int compare(Square o1, Square o2) {
                return o1.age - o2.age;
            }
        });
//        squares.sort(new Comparator<Square>() {
//            @Override
//            public int compare(Square o1, Square o2) {
//                if (o1.side - o2.side == 0) {
//                    return o1.age - o2.age;
//                }
//                return o1.side - o2.side;
//            }
//        });
        System.out.println(squares);
    }
}
