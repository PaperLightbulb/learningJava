package com.learningJava.projects.bowl;

import java.util.Random;
import java.util.Scanner;

public class BowlDriver {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius: ");
        int radius = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Height: ");
        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Material: ");
        String material = scanner.nextLine();


        Bowl bowl = new Bowl(radius, height, material);
        System.out.println(bowl.toString());

        if(bowl.getRadius()>5){
            System.out.println("you chose wrong");
        }else {
            System.out.println("you chose right");
        }
        Random random=new Random();
        System.out.println("chose a random number betwen 1 and 3");
        if (random.nextInt(3)+1==scanner.nextInt()){
            System.out.println("crap");
        }
        String[] fruits = {
                "apple",
                "banana",
                "pear",
                "coconut",
                "tomato",
        };

        for (int i = 0; i < 10; i++) {
            System.out.println(fruits[random.nextInt(fruits.length)]);
        }
        // TODO create a bowl object and assign it to a variable called bowl, setting it's radius, height, and material to 15, 12, and "Glass", respectively
        // TODO print out the toString method of the bowl
    }
}
