package com.learningJava.dataandlogic;

public class Shirt {
    public enum Size {
        SMALL ("small"),
        MEDIUM ("medium"),
        LARGE ("large"),
        XLARGE ("extra large");
        Size(String sizeString) {
            this.sizeString = sizeString;
        }
        private final String sizeString;

        public String toString() {
            return sizeString;
        }
    }

    private Size size;

    private String color;

    private int collar;

    public Shirt (Size size, String color, int collar) {
        this.size = size;
        this.color = color;
        this.collar = collar;
    }
    @Override
    public String toString () {
        return  "The shirt's size is " + size.toString() + ", the shirt's color is " + color + ", and the shirts collar size in cm is " + Integer.toString(collar);
    }
    public Shirt () {

    }
    public int getCollar() {
        return collar;
    }

    public void setCollar(int collar) {
        this.collar = collar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
