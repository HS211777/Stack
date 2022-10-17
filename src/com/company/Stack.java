package com.company;

public class Stack {
    private static int arr[];
    private static int top;
    private static int capacity;

    public static void createStack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public static boolean isFull(){
        return top == capacity -1;
    }

    public static boolean isEmpty(){
        return top == -1;
    }

    public static int getSize(){
        return top + 1;
    }

    public static void push(int x){
        if (isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            System.out.println("Inserting "+x);
            arr[++top] = x;
        }
    }

    public static int pop(){
        int out = 0;
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            out = arr[--top];
        }
        return out;
    }

    public static void printStack(){
        for (int i = 0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }
}
