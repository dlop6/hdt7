package com;


public class TreeNode<T> {


    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    private Association<T, T> asociacion;

    public TreeNode(T key, T value) {
        this.data = key;
        this.left = null;
        this.right = null;
        this.asociacion = new Association<T, T>(key, value);
    }

    public T getData() {
        return data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public Association<T, T> getAsociacion() {
        return asociacion;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public void setAsociacion(Association<T, T> asociacion) {
        this.asociacion = asociacion;
    }

    
    
}
