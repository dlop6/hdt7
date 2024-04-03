package com;

import java.util.ArrayList;

/**
 * Esta clase representa un árbol binario.
 * 
 * @param <T> el tipo de datos que se almacenará en el árbol, debe ser comparable.
 */
public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> root;

    /**
     * Crea un nuevo árbol binario vacío.
     */
    public BinaryTree() {
        this.root = null;
    }

    /**
     * Obtiene el nodo raíz del árbol.
     * 
     * @return el nodo raíz del árbol.
     */
    public TreeNode<T> getRoot() {
        return root;
    }

    /**
     * Inserta un nuevo nodo en el árbol con la clave y el valor especificados.
     * 
     * @param key la clave del nodo.
     * @param value el valor del nodo.
     */
    public void insert(T key, T value) {
        // Implementación obtenida de https://www.geeksforgeeks.org/binary-find-tree-set-1-find-and-insertion/
        TreeNode<T> newTreeNode = new TreeNode<T>(key, value);
        if (root == null) {
            root = newTreeNode;
        } else {
            TreeNode<T> current = root;
            TreeNode<T> parent;
            while (true) {
                parent = current;
                if (key.compareTo(current.getData()) > 0) {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newTreeNode);
                        return;
                    }
                } else {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newTreeNode);
                        return;
                    }
                }
            }
        }
    }

    /**
     * Busca un nodo en el árbol con la clave especificada y devuelve su valor asociado.
     * 
     * @param key la clave del nodo a buscar.
     * @return el valor asociado al nodo encontrado, o null si no se encuentra el nodo.
     */
    public T find(T key) {
        TreeNode<T> current = root;
        while (current != null) {
            if (key.compareTo(current.getData()) == 0) {
                return current.getAsociacion().getValue();
            } else if (key.compareTo(current.getData()) > 0) {
                current = current.getRight();
            } else {
                current = current.getLeft();
            }
        }
        return null;
    }

    /**
     * Realiza un recorrido in-order en el árbol y devuelve una lista de las asociaciones de los nodos.
     * 
     * @param treeNode el nodo a partir del cual se realizará el recorrido.
     * @param list la lista donde se almacenarán las asociaciones de los nodos.
     * @return la lista de las asociaciones de los nodos en orden.
     */
    public ArrayList<Asociacion<T,T>> inOrder(TreeNode<T> treeNode, ArrayList<Asociacion<T,T>> list) {
        if (treeNode != null) {
            inOrder(treeNode.getLeft(), list);
            list.add(treeNode.getAsociacion());
            inOrder(treeNode.getRight(), list);
        }
        return list;
    }
}
