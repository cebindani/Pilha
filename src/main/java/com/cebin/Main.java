package com.cebin;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {

        Stack pilha = new Stack();
        pilha.add(10);
        pilha.add(20);
        pilha.add(30);

        System.out.println("Tamanho da pilha = "+pilha.size());
        pilha.clean();
        System.out.println("Tamanho da pilha = "+pilha.size());

        pilha.remove();
        System.out.println(pilha.returnTop());
        System.out.println("Tamanho da pilha = "+pilha.size());
        //pilha.remove();

       // System.out.println("Tamanho da pilha = "+pilha.size());
        //System.out.println(pilha.top.content);

    }
}
