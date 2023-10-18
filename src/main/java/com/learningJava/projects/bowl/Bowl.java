package com.learningJava.projects.bowl;

public class Bowl {
    // TODO Create public int variables radius, height,
    // TODO Create public String variable material,
    // TODO Create a null constructor,
    // TODO Create constructor method that sets each of the variables,
    // TODO Create a toString() method that returns the string "Radius: " + radius + ". Height: " + height + ". Material: " + material + "."\
    private   int radius;
    private  int height;
    private String material;
    public Bowl (int radius, int height, String material) {
        this.radius = radius;
        this.height = height;
        this. material = material;
    }
    public String toString () {
        return "Radius: " + radius + ". Height: " + height + ". Material: " + material + ".";
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public String getMaterial() {
        return material;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
