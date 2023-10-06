package com.learningJava.dataandlogic;

public class Logic {
    public static void main(String[] args) {
        if (1 == 2) {
            System.out.println("1 == 2");
        } else {
            System.out.println("1 =/= 2");
        }

        Shirt myFirstShirt = new Shirt(Shirt.Size.SMALL, "Red", 2);
        Shirt mySecondShirt = new Shirt(Shirt.Size.SMALL, "Red", 2);


        //pointers vs values
        if (myFirstShirt.getColor() == mySecondShirt.getColor()) {
            System.out.println("The shirts colors are equal");
        } else {
            System.out.println("the shirts colors are not equal");
        }


        switch (myFirstShirt.getSize()) {
            case SMALL -> {
                System.out.println("the first shirt is small");
            }
            case MEDIUM -> {
                System.out.println("the firstt shirt is medium");
            }
            case LARGE -> {
                System.out.println("the first shirt is large");
            }
            case XLARGE -> {
                System.out.println("the first shirt is extra large");
            }
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            //talk about types of incrementors
            i = i+1;
        }

        System.out.println();

        int l = 0;
        do {
           System.out.println(l);
           l++;
        } while (l < 10);

        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
