package com;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BinaryTreeTest {
    @Test
    public void checkingTheRoot() {
        BinaryTree<String> tree = new BinaryTree<String>();
        tree.insert("blue", "azul");
        tree.insert("red", "rojo");
        tree.insert("yellow", "amarillo");
        tree.insert("black", "negro");

        assertTrue(tree.getRoot().getData().equals("blue"));

    }

    @Test
    public void checkingordenado() {
        BinaryTree<String> tree = new BinaryTree<String>();
        tree.insert("wolf", "lobo");
        tree.insert("dog", "perro");
        tree.insert("cat", "gato");
        tree.insert("fish", "pez");

        ArrayList<Asociacion<String, String>> Expected = new ArrayList<Asociacion<String, String>>(Arrays.asList(
                new Asociacion<String, String>("cat", "gato"),
                new Asociacion<String, String>("dog", "perro"),
                new Asociacion<String, String>("fish", "pez"),
                new Asociacion<String, String>("wolf", "lobo")));

        ArrayList<Asociacion<String, String>> result = tree.ordenado(tree.getRoot(),
                new ArrayList<Asociacion<String, String>>());
        for (int i = 0; i < result.size(); i++) {
            assertTrue(result.get(i).getKey().equals(Expected.get(i).getKey()));
            assertTrue(result.get(i).getValue().equals(Expected.get(i).getValue()));
        }
    }

    @Test
    public void findAssociation() {
        BinaryTree<String> tree = new BinaryTree<String>();
        tree.insert("blue", "azul");
        tree.insert("red", "rojo");
        tree.insert("yellow", "amarillo");
        tree.insert("black", "negro");

        assertTrue(tree.find("blue").equals("azul"));
        assertTrue(tree.find("red").equals("rojo"));
        assertTrue(tree.find("yellow").equals("amarillo"));
        assertTrue(tree.find("black").equals("negro"));
    }
}
