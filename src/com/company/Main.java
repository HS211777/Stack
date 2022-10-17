package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.createStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: ");
        stack.printStack();

        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();
    }
}
