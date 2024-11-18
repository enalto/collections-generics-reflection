package com.enalto.stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Juliana");
        stack.push("Enalto");
        stack.push("Giovanna");
        stack.push("Vitoria");
        stack.push("Enaldo");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());

        }
    }
}
