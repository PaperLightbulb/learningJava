package com.learningJava.objects.pens;

public class Pen {
    protected int length;
    protected String make;
    public Pen (int length, String make) {
        this.length = length;
        this.make = make;
    }
    public Pen () {

    }


    public String getMake() {
        return make;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString () {
        return "This pen is " + length + "cm long and of " + make;
    }
}
