package com;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTreeTest {
    @Test
    public void checkingTheRoot(){
        BinaryTree<String> tree = new BinaryTree<String>();
        tree.insert("wolf", "lobo");
        tree.insert("dog", "perro");
        tree.insert("cat", "gato");
        tree.insert("fish", "pez");

        assertTrue(tree.getRoot().getData().equals("wolf"));

    }

    @Test
    public void checkingInOrder(){
        BinaryTree<String> tree = new BinaryTree<String>();
        tree.insert("wolf", "lobo");
        tree.insert("dog", "perro");
        tree.insert("cat", "gato");
        tree.insert("fish", "pez");

        ArrayList<Association<String, String>> Expected = new ArrayList<Association<String, String>>(Arrays.asList(
            new Association<String, String>("cat", "gato"),
            new Association<String, String>("dog", "perro"),
            new Association<String, String>("fish", "pez"),
            new Association<String, String>("wolf", "lobo")
        ));

        ArrayList<Association<String, String>> result = tree.Ordenarlo(tree.getRoot(), new ArrayList<Association<String, String>>());
        for (int i = 0; i < result.size(); i++) {
            assertTrue(result.get(i).getKey().equals(Expected.get(i).getKey()));
            assertTrue(result.get(i).getValue().equals(Expected.get(i).getValue()));
        }
    }

    @Test
    public void findAssociation(){
        BinaryTree<String> tree = new BinaryTree<String>();
        tree.insert("wolf", "lobo");
        tree.insert("dog", "perro");
        tree.insert("cat", "gato");
        tree.insert("fish", "pez");

        assertTrue(tree.find("wolf").equals("lobo"));
        assertTrue(tree.find("dog").equals("perro"));
        assertTrue(tree.find("cat").equals("gato"));
        assertTrue(tree.find("fish").equals("pez"));
    }

}