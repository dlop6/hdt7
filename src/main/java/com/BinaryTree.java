package com;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable <T>> {

    private TreeNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public void insert(T key, T value) { // obtenido de  //Implemntacion agarra de https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/ (GOAT GeeksforGeeks!!)
        TreeNode<T> newNode = new TreeNode<T>(key, value);
        if (root == null) {
            root = newNode;
        }
        else {
            TreeNode<T> current = root;
            TreeNode<T> parent;
            while (true) {
                parent = current;
                if (key.compareTo(current.getData()) < 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    public TreeNode<T> find(T data) {
        TreeNode<T> current = root;
        while (current != null) {
            if (data.compareTo(current.getData()) == 0) {
                return current.getAsociacion().getValue();
            } else if (data.compareTo(current.getData()) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    public ArrayList<Association<T, T>> Ordenarlo( TreeNode<T> root, ArrayList<Association<T, T>> list) {
        if (root != null) {
            Ordenarlo(root.left, list);
            list.add(root.getAsociacion());
            Ordenarlo(root.right, list);
        }
        
        return list;
    }

    public boolean contains(T data) {
        return find(data) != null;
    }

}