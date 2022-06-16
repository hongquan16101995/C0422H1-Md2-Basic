package bai11;

import java.util.Stack;

public class UseStackQueue {
    public static void main(String[] args) {
        //cấu trúc dữ liệu dạng ngăn xếp
        //phần tử vào đầu sẽ lấy ra cuối cùng
        //phần tử vào cuối sẽ lấy ra đầu tiên
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
