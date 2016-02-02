package com.cebin;

import org.junit.Test;

import static org.junit.Assert.*;


public class PilhaTest {



    @Test
    public void testAdd() throws Exception {
        Pilha p = new Pilha();
        p.add(1);
        p.add(2);
        p.add(3);

        assertEquals(3 , p.tamanho());

    }

    @Test
    public void testRemove() throws Exception {
        Pilha p = new Pilha();
        p.add(1);
        p.add(2);
        p.add(3);

        p.remove();
        assertEquals(2,p.tamanho());

    }

    @Test
    public void testLimpaPilha(){
        Pilha p = new Pilha();
        p.add(1);
        p.add(2);

        p.limpa();
        assertEquals(0,p.tamanho());

    }

    @Test
    public void testTamanhoPilhaVazia()  {
        Pilha p = new Pilha();
        assertEquals(0,p.tamanho());

    }

    @Test
    public void testRetornaTopo(){
        Pilha p = new Pilha();
        p.add(1);
        p.add(2);

        assertEquals(2,p.retornaTopo());


    }
}