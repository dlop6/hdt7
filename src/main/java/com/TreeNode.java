package com;

/**
 * Clase que representa un nodo de un árbol binario.
 *
 * @param <T> el tipo de dato almacenado en el nodo
 */
public class TreeNode<T> {

    private T data;
    private Asociacion<T, T> association;
    private TreeNode<T> left;
    private TreeNode<T> right;

    /**
     * Crea un nuevo nodo con la clave y el valor especificados.
     *
     * @param key la clave del nodo
     * @param value el valor asociado al nodo
     */
    public TreeNode(T key, T value) {
        this.data = key;
        this.association = new Asociacion<T, T>(key, value);
        this.left = null;
        this.right = null;
    }

    /**
     * Obtiene el dato almacenado en el nodo.
     *
     * @return el dato almacenado en el nodo
     */
    public T getData() {
        return data;
    }

    /**
     * Obtiene la asociación almacenada en el nodo.
     *
     * @return la asociación almacenada en el nodo
     */
    public Asociacion<T, T> getAsociacion() {
        return association;
    }
    
    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return el hijo izquierdo del nodo
     */
    public TreeNode<T> getLeft() {
        return left;
    }

    /**
     * Establece el hijo izquierdo del nodo.
     *
     * @param left el nuevo hijo izquierdo del nodo
     */
    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return el hijo derecho del nodo
     */
    public TreeNode<T> getRight() {
        return right;
    }

    /**
     * Establece el hijo derecho del nodo.
     *
     * @param right el nuevo hijo derecho del nodo
     */
    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}
