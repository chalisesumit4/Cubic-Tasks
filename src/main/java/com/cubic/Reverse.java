package com.cubic;

import java.util.Stack;

public class Reverse {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("h");
        stack.push("e");
        stack.push("l");
        stack.push("l");
        stack.push("o");

        while(stack.size() > 0){
            System.out.print(stack.pop());
        }
    }
}
