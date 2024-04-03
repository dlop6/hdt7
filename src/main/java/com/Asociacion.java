package com;

/**
 * La clase Asociacion representa una asociación entre una clave y un valor.
 * 
 * @param <K> el tipo de la clave
 * @param <V> el tipo del valor
 */
public class Asociacion<K, V> {
    private K key;
    private V value;

    /**
     * Crea una nueva instancia de la clase Asociacion con la clave y el valor especificados.
     * 
     * @param key la clave de la asociación
     * @param value el valor de la asociación
     */
    public Asociacion(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Obtiene la clave de la asociación.
     * 
     * @return la clave de la asociación
     */
    public K getKey() {
        return key;
    }

    /**
     * Obtiene el valor de la asociación.
     * 
     * @return el valor de la asociación
     */
    public V getValue() {
        return value;
    }

    /**
     * Establece la clave de la asociación.
     * 
     * @param key la nueva clave de la asociación
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * Establece el valor de la asociación.
     * 
     * @param value el nuevo valor de la asociación
     */
    public void setValue(V value) {
        this.value = value;
    }
}
