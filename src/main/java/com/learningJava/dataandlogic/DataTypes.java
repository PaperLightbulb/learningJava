package com.learningJava.dataandlogic;

public class DataTypes {
    public static void main(String[] args) {
        String myString = "Hello World";

        System.out.print("myString == ");
        System.out.println(myString);

        int myInt = 2;
        char myChar = 'd';
        double myDouble = 72985134075890175890317890517839427538902.548179258391;
        boolean myBool = false;

        System.out.print("myInt == ");
        System.out.println(myInt);
        System.out.print("myChar == ");
        System.out.println(myChar);
        System.out.print("myDouble == ");
        System.out.println(myDouble);
        System.out.print("myBool == ");
        System.out.println(myBool);

        System.out.println();

        System.out.print("myInt == ");
        System.out.println(Integer.toString(myInt));

        Shirt myShirt = new Shirt(Shirt.Size.LARGE, "Blue", 3);
        System.out.println(myShirt.toString());
    }
}
