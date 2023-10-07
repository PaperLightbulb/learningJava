package com.learningJava.ioandexceptions;

import com.github.javaparser.CharStream;

import java.io.*;
import java.util.Scanner;

public class IO {
    public static void main(String args[]) throws IOException {
        createFile("filename.txt");

        writeFile("filename.txt", "Successfully wrote to the file.");

        System.out.println("Read from file: " + readFile("filename.txt"));
    }
    private static void createFile (String file) {
        try {
            File myObj = new File(file);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private static void writeFile (String file, String write) {
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("Written to file");
            myWriter.close();
            System.out.println(write);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private static String readFile (String file) {
        try {
            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}