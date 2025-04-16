package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void newStack_Empty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty(), "La pile devrait être vide après création");
        assertEquals(0, stack.size(), "La taille de la pile devrait être 0");
    }

    @Test
    void push_AddElement() {
        Stack stack = new Stack();
        stack.push(42);
        assertFalse(stack.isEmpty(), "La pile ne devrait plus être vide après push()");
        assertEquals(1, stack.size(), "La pile devrait contenir 1 élément");
        assertEquals(42, stack.peek(), "Le sommet de la pile devrait être 42");
    }

    @Test
    void pop_RemovesAndReturnsTopElement() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        int value = stack.pop();
        assertEquals(20, value, "Le pop() devrait renvoyer le dernier élément ajouté (20)");
        assertEquals(1, stack.size(), "La pile devrait maintenant contenir 1 élément");
        assertEquals(10, stack.peek(), "Le sommet de la pile devrait maintenant être 10");
    }

    @Test
    void peek_ReturnsTopElementWithoutRemoving() {
        Stack stack = new Stack();
        stack.push(5);
        int top = stack.peek();
        assertEquals(5, top, "peek() devrait renvoyer 5");
        assertEquals(1, stack.size(), "La taille ne devrait pas changer après peek()");
    }

    @Test
    void expandArray() {
        Stack stack = new Stack();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        assertEquals(15, stack.size(), "La pile devrait contenir 15 éléments après agrandissement");
        assertEquals(14, stack.peek(), "Le sommet devrait être 14");
    }

    @Test
    void pop_EmptyStackShouldThrowException() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop, "pop() sur une pile vide devrait lever une exception");
    }

    @Test
    void peek_EmptyStackShouldThrowException() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::peek, "peek() sur une pile vide devrait lever une exception");
    }
}
