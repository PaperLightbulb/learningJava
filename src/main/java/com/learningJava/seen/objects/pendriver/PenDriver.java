package com.learningJava.seen.objects.pendriver;

import com.learningJava.seen.objects.pens.Micron;
import com.learningJava.seen.objects.pens.Pen;

public class PenDriver {
    public static void main(String[] args) {
        Pen pen = new Pen(13, "posca");
        System.out.println(pen.toString());

        Micron micron = new Micron("red");
        System.out.println(micron.toString());

        Pen micronPen = new Micron("blue");
        System.out.println(micronPen.toString());

        // show the reverse does not work
    }
}
