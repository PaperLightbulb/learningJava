package com.learningJava.newStuff;


import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.*;

public class WebScraper {
    public static void main(String[] args) {
        String url = "https://forecast.weather.gov/MapClick.php?lat=45.1089&lon=-93.3472";
        // initializing the HTML Document page variable
        try {
            Document doc = Jsoup.connect(url).get();

            Elements fTemps = doc.getElementsByClass("myforecast-current-lrg");
            Elements cTemps = doc.getElementsByClass("myforecast-current-sm");

            System.out.println("Weather in Brooklyn Park, MN: ");
            for (Element fTemp :fTemps) {
                System.out.println("Temp (F): " + fTemp.html());
            }
            for (Element cTemp :cTemps) {
                System.out.println("Temp (C): " + cTemp.html());
            }
         } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
