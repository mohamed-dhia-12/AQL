package org.example;

public class Stack {

    private int[] array;
    private int top;
    private static final int INITIAL_CAPACITY = 10;


    public Stack() {
        array = new int[INITIAL_CAPACITY];
        top = -1;  // La pile est vide
    }

    public void push(int element) {
        if (top == array.length - 1) {
            expandArray();  // Double la taille du tableau si plein
        }
        array[++top] = element;
    }


    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return array[top--];
    }


    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return array[top];
    }

    /**
     * Vérifie si la pile est vide.
     * @return true si vide, sinon false
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Retourne le nombre d’éléments dans la pile.
     * @return taille de la pile
     */
    public int size() {
        return top + 1;
    }

    /**
     * Méthode privée pour doubler la taille du tableau interne.
     */
    private void expandArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
