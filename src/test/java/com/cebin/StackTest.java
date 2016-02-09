package com.cebin;

import org.junit.Test;
import static org.junit.Assert.*;


public class StackTest {


    @Test
    public void testAdd() {
        Stack pilha = new Stack();
        pilha.add(1);
        pilha.add(2);
        pilha.add(3);

        assertEquals(3, pilha.size());

    }

    @Test
    public void testRemove(){
        Stack pilha = new Stack();
        pilha.add(1);
        pilha.add(2);
        pilha.add(3);

        pilha.remove();
        assertEquals(2, pilha.size());

    }

    @Test
    public void testLimpaPilha() {
        Stack pilha = new Stack();
        pilha.add(1);
        pilha.add(2);

        pilha.clean();
        assertEquals(0, pilha.size());

    }

    @Test
    public void testTamanhoPilhaVazia() {
        Stack pilha = new Stack();
        assertEquals(0, pilha.size());

    }

    @Test
    public void testRetornaTopo() {
        Stack pilha = new Stack();
        pilha.add(1);
        pilha.add(2);

        assertEquals(2, pilha.returnTop());
    }

    @Test
    public void testRetornaTopoPilhaVazia(){
        Stack pilha = new Stack();

        assertEquals(-1,pilha.returnTop());

    }
}