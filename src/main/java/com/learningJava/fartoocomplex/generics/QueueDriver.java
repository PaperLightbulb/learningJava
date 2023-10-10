package com.learningJava.fartoocomplex.generics;

public class QueueDriver {
    public static void main(String[] args) {
        Queue<Integer> myIntegerQueue = new Queue<>();

        for (int i = 0; i < 10; i++){
            myIntegerQueue.enQueue(i);
        }
        for (int i = 0; i < 10; i++){
            System.out.println(myIntegerQueue.peek());
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            System.out.println(myIntegerQueue.deQueue());
        }
    }
}