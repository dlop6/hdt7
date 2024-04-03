package com;

import java.io.BufferedReader;
import java.util.ArrayList;


/**
 * La clase DictionaryReader se encarga de leer un archivo de texto y cargar su contenido en un diccionario.
 */
public class DictionaryReader {

    /**
     * Carga el contenido de un archivo de texto en un diccionario.
     * 
     * @param txt_path la ruta del archivo de texto a cargar
     * @return un ArrayList de Asociacion<String, String> que representa el diccionario cargado desde el archivo de texto
     */
    public static ArrayList<Asociacion<String, String>> LoadTxt(String txt_path){
        ArrayList<Asociacion<String, String>> diccionario = new ArrayList<Asociacion<String, String>>();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(txt_path))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[()]", "");
                line = line.toLowerCase();
                String[] parts = line.split(",");
                Asociacion<String, String> Association = new Asociacion<String, String>(parts[0], parts[1]);
                diccionario.add(Association);
            }
            return diccionario;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
