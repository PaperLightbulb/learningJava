package com.learningJava.objects.pens;

public class Micron extends Pen{
    protected String color;

    public Micron (String color) {
        this.color = color;
        length = 12;
        make = "Micron";
    }

    @Override
    public String toString () {
        return "This micron is " + length + "cm long and its color is " + color;
    }
}
