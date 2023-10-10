package com.learningJava.arraysandmethods;

import com.learningJava.seen.dataandlogic.Shirt;

import java.util.ArrayList;

public class ArraysAndMethods {
    public static void main(String[] args) {
        int[] intergers = {
                1,
                300,
                35,
                23,
                236,
                624,
        };

        for (int i = 0; i < intergers.length; i++) {
            System.out.println(intergers[i]);
        }

        System.out.println();

        Shirt[] myShirts = {
                new Shirt(Shirt.Size.XLARGE, "orange", 3),
                new Shirt(Shirt.Size.LARGE, "blue", 4),
                new Shirt(Shirt.Size.XLARGE, "purple", 2),
                new Shirt(Shirt.Size.LARGE, "brown", 4),
                new Shirt(Shirt.Size.XLARGE, "beige", 1),
        };


        for (int i = 0; i<myShirts.length; i++) {
            printShirt(myShirts[i]);
        }

        System.out.println();

        System.out.println(myReturningMethod());

        System.out.println();

        ArrayList<Integer> integersArrayList = new ArrayList<Integer>();

        integersArrayList.add(2);
        integersArrayList.add(5);
        integersArrayList.add(390259);
        integersArrayList.add(1987538917);

        for (Integer integer : integersArrayList) {
            System.out.println(integer);
        }


    }
    // talk about private visibilty and static keyword and why they're useful
    private static void printShirt (Shirt shirt) {
        System.out.println(shirt.toString());
    }

    private static String myReturningMethod () {
        return "Returned string";
    }

    // talk about how main method is special method that you can run
}
