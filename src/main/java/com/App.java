package com;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Bienvenido al traductor!");
        ArrayList<Association<String, String>> list = DictionaryReader.LoadTxt("diccionario.txt");
        BinaryTree<String> tree = new BinaryTree<>();
        ArrayList<String> palabras = new ArrayList<String>();
    
        // Insert words from the dictionary into the tree
        for (Association<String, String> association : list) {
            tree.insert(association.getKey(), association.getValue());
        }
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese la oracion a traducir: ");
        String oracion = sc.nextLine();
        String[] palabrasOracion = oracion.split(" ");
    
        for (String palabra : palabrasOracion) {
            TreeNode<String> nodo = tree.find(palabra);
            if (nodo != null) {
                palabras.add(nodo.getValue());
            } else {
                palabras.add(palabra);
            }
        }
    
        System.out.println("La oracion traducida es: ");
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }
    }

    }

}
