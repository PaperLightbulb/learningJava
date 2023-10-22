package com.learningJava.newStuff;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebScraper {
    public static void main(String[] args) {
        try {

            String url = "https://www.accuweather.com/en/us/minneapolis/55415/weather-forecast/348794";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
// optional request header
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            int responseCode = con.getResponseCode();
            System.out.println("Response code: " + responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            String html = response.toString();
            String start = "temp\">";
            String end = "<";
            System.out.println(html.substring(html.indexOf(start), html.indexOf(end)));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
