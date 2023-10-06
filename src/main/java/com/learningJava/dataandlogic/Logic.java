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
        if (myFirstShirt.equals(mySecondShirt)) {
            System.out.println("The shirts are equal");
        } else {
            System.out.println("the shirts are not equal");
        }


        switch (myFirstShirt.getSize()) {
            case SMALL -> {
                System.out.println("the fisrt shirt is small");
            }
            case MEDIUM -> {
                System.out.println("the fisrt shirt is medium");
            }
            case LARGE -> {
                System.out.println("the fisrt shirt is large");
            }
            case XLARGE -> {
                System.out.println("the fisrt shirt is extra large");
            }
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            //talk about types of incrementors
            i = i+1;
        }

        int l = 0;
        do {
           System.out.println(l);
        } while (l < 10);

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
