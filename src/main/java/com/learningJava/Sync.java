package com.learningJava;

public class Sync {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int potatoes = 5;

        System.out.println(potatoes);

        System.out.println();

        System.out.println(potatoes + potatoes);

        System.out.println();

        System.out.println(potatoes * potatoes);

        System.out.println();

        System.out.print("Potatoes: ");
        System.out.println(potatoes);

        System.out.println();

        System.out.println("Potatoes: " + potatoes);

        System.out.println();

        // this text will not be run as code
        System.out.println("This will though");
        /*
        this also wont


        or this
         */

        System.out.println(potatoes); // this also wont be run (but the print line will)

        System.out.println();

        String name = "john";

        System.out.println("Name: " + name);

        System.out.println();

        potatoes = potatoes + 1;
        System.out.println("Potatoes: " + potatoes);

        System.out.println();

        potatoes += 1;
        System.out.println("Potatoes: " + potatoes);

        System.out.println();

        potatoes++;
        System.out.println("Potatoes: " + potatoes);

        System.out.println();

        potatoes = 20;

        System.out.println("Potatoes: " + potatoes);

        final double pi = 3.14159; // this variable cannot be changed because it has the final keyword

        System.out.println();

        System.out.println(pi);

        System.out.println();

        //pi = 12; will error

        System.out.println(potatoes + " " + pi);

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println();

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println();

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        System.out.println();

        System.out.println(sum3);

        System.out.println();

        System.out.println(name.length()); // prints the name variables length in characters
        System.out.println(name.indexOf("h")); // prints the index of h in the word john

        System.out.println();

        String lastname = "doe";

        System.out.println(name + " " + lastname); // note you have to add a space between the two strings or they will print as one word

        // System.out.println(name + potatoes); will throw an error because the types of data do not match, you cant add a word to a number

        System.out.println();

        String x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String)

        System.out.println(z);

        System.out.println();

        int x2 = 10;
        int y2 = 20;
        int z2 = x2 + y2;

        System.out.println(z2);

        System.out.println();

        String x3 = "10";
        int y3 = 20;
        String z3 = x3 + y3;  // z will be 1020 (a String)

        System.out.println(z3);

        System.out.println();

        //String txt = "We are the so-called "Vikings" from the north."; wont work because the quotes in the string will end and start new strings

        String txt = "We are the so-called \"Vikings\" from the north."; // by adding back slashes we can create special characters

        System.out.println();

        /*
        \` is `
        \" is "
        \\ is \
        these characters cant nomrally be put in strings for various reasons
        but when you put a backslash infront it works
         */

        System.out.println("It\'s alright."); // another example of using backslashes to create special characters

        System.out.println();
        System.out.println("Math: ");

        System.out.println("the max of 5 and 10 is " + Math.max(5, 10));
        System.out.println("the min of 5 and 10 is " + Math.min(5, 10));
        System.out.println("the sqrt of 64 is " + Math.sqrt(64));
        System.out.println("the absoulute value of -4.7 is " + Math.abs(-4.7));
        System.out.println(Math.random() + " is a random number between 0 and 1");
        System.out.println((int)(Math.random() * 101) + " is a random interger between 0 and 100");

        System.out.println();

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        System.out.println();

        int a = 10;
        int b = 9;
        System.out.println(a > b); // returns true, because 10 is higher than 9
        System.out.println(10 > 9);

        System.out.println(a == 10);

        System.out.println(10 == 15);

        System.out.println();

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        System.out.println();

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        if (a > b) {
            System.out.println("a is greater than b");
        }

        System.out.println();

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        time = 20;
        String result = (time < 18) ? "Good day." : "Good evening."; // shorthand if else
        System.out.println(result);

        System.out.println();

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        // Outputs "Thursday" (day 4)

        System.out.println();

        day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

        System.out.println();
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        System.out.println();
        for (int j = 0; j <= 10; j = j + 2) {
            System.out.println(j);
        }
        System.out.println();

        for (int h = 1; h <= 2; h++) {
            System.out.println("Outer: " + h); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        System.out.println();


        for (int l = 0; l < 10; l++) {
            if (l == 4) {
                break;
            }
            System.out.println(l);
        }
        System.out.println();
        for (int l = 0; l < 10; l++) {
            if (l == 4) {
                continue;
            }
            System.out.println(l);
        }
        System.out.println();

        String[] fruits = {"banana", "apple", "orange", "8"};
        System.out.println(fruits[0]);

        System.out.println();

        fruits[0] = "tangarine";

        System.out.println(fruits[0]);

        System.out.println();

        System.out.println(fruits.length);

        System.out.println();

        for (int l = 0; l < fruits.length; l++)  {
            System.out.println(fruits[l]);
        }

        System.out.println();

        for (String h : fruits) {
            System.out.println(h);
        }

        System.out.println();

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        System.out.println();
        for (int l = 0; l< myNumbers.length; ++l) {
            for(int j = 0; j < myNumbers[l].length; ++j) {
                System.out.println(myNumbers[l][j]);
            }
            System.out.println();
        }

    }
}
