package com.learningJava.fartoocomplex.generics;

public class StackDriver {
    public static void main(String[] args) {
        Stack<Integer> myIntegerStack = new Stack<>();

        for (int i = 0; i < 10; i++){
            myIntegerStack.push(i);
        }
        for (int i = 0; i < 10; i++){
            System.out.println(myIntegerStack.peek());
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println(myIntegerStack.pop());
        }
    }
}
