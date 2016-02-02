package com.cebin;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();
        pilha.add(10);
        pilha.add(20);
        pilha.add(30);

        System.out.println("Tamanho da pilha = "+pilha.tamanho());
        pilha.limpa();
        System.out.println("Tamanho da pilha = "+pilha.tamanho());

        pilha.remove();
        pilha.remove();

        System.out.println("Tamanho da pilha = "+pilha.tamanho());
        System.out.println(pilha.topo.conteudo);

    }
}
