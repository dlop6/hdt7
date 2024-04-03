package com;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * La clase lectorOracion proporciona un método para cargar un archivo de texto y convertirlo en una lista de oraciones.
 */
public class lectorOracion {
    /**
     * Carga un archivo de texto y devuelve una lista de oraciones.
     * Cada oración se representa como una lista de palabras en minúsculas.
     * 
     * @param txt_path la ruta del archivo de texto a cargar
     * @return una lista de oraciones, donde cada oración es una lista de palabras en minúsculas
     */
    public static ArrayList<ArrayList<String>> LoadTxt(String txt_path) {
        ArrayList<ArrayList<String>> sentences = new ArrayList<ArrayList<String>>();
        try (Scanner sc = new Scanner(new File(txt_path))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(" ");
                ArrayList<String> sentence = new ArrayList<String>();
                for (String part : parts) {
                    sentence.add(part.toLowerCase());
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
