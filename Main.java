package com.company;


import java.util.Random;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String[] fileName = {"Caleb", "Liam", "Ben", "Paul", "Adam", "Ryan Pettit", "Ryan Guo", "Max", "John Le", "Marcus", "Connor", "Philip", "Christian", "Brian"};
        String[] selectedPerson = {"Caleb", "Liam", "Ben", "Paul", "Adam", "Ryan Pettit", "Ryan Guo", "Max", "John Le", "Marcus", "Connor", "Philip", "Christian", "Brian"};

        String tempString;
        Random rand = new Random();
        boolean check;

        for (int i = 0; i < fileName.length; i++) {

            int masterInt = 0;


            do {
                check = false;
                int jeff = rand.nextInt(selectedPerson.length);

                if (selectedPerson[jeff] != "X") {

                    if (!fileName[i].equals(selectedPerson[jeff])) {
                        check = true;
                        masterInt = jeff;
                    }
                    if (fileName[i].equals((selectedPerson[jeff])) && i == selectedPerson.length - 1) {
                        System.out.println("CRITICAL ERROR REDO ALL FILES");
                    }
                }

            } while (!check);

            try {
                FileWriter writer = new FileWriter(fileName[i] + ".txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);

                    bufferedWriter.newLine();
                    bufferedWriter.write(selectedPerson[masterInt]);

                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            selectedPerson[masterInt] = "X";


        }
    }
}
