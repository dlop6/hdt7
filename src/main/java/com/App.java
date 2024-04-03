package com;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> sentences = lectorOracion.LoadTxt("src\\main\\java\\com\\txt files\\oracion.txt");
        ArrayList<Asociacion<String, String>> diclist = DictionaryReader
                .LoadTxt("src\\main\\java\\com\\txt files\\Diccionario.txt");
        BinaryTree<String> dic = new BinaryTree<String>();

        for (Asociacion<String, String> association : diclist) {
            dic.insert(association.getKey(), association.getValue());
        }

        ArrayList<Asociacion<String, String>> result = new ArrayList<Asociacion<String, String>>();

        result = dic.ordenado(dic.getRoot(), result);
        for (Asociacion<String, String> association : result) {
            System.out.println(association.getKey() + "," + association.getValue());
        }

        for (ArrayList<String> sentence : sentences) {
            ArrayList<String> sentenceString = new ArrayList<String>();
            for (String word : sentence) {
                String traduccion = dic.find(word);
                if (traduccion != null) {
                    sentenceString.add(traduccion);
                } else {
                    sentenceString.add("'" + word + "'");
                }
            }
            System.out.println(String.join(" ", sentenceString));
        }
    }
}
