package com;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class lectorOracion {
    public static ArrayList<ArrayList<String>> LoadTxt(String txt_path){
        ArrayList<ArrayList<String>> sentences = new ArrayList<ArrayList<String>>();
        try (Scanner sc = new Scanner(new File(txt_path))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    parts[i] = parts[i].toLowerCase();
                }
                ArrayList<String> sentence = new ArrayList<String>();
                for (String part : parts) {
                    sentence.add(part);
                }
                sentences.add(sentence);
            }
            return sentences;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
