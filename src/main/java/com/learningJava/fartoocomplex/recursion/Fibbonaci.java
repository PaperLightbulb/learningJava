package com.learningJava.fartoocomplex.recursion;

public class Fibbonaci {
    public static void main(String[] args) {
        System.out.println(fib(30));
    }

    private static int fib(int i) {
        return fibRecursion(i,1,0);
    }
    private static int fibRecursion(int i, int s1, int s2) {
        if (i == 1){
            return s1;
        }
        return fibRecursion(i-1, s1+s2, s1);
    }
}
