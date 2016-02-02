package com.cebin;


public class Pilha {

    protected No topo;


    public Pilha() {
        topo = null;
    }


    public void add(int conteudo) {

        No no = new No(conteudo);
        no.prox = topo;
        topo = no;

    }

    public void remove() { //seria melhor retornar alguma coisa?
        //se pilha nao vazia
        if (topo != null) {
            No no = topo;
            topo = topo.prox;
            no.prox = null;
            //no removido
        } else {
            System.out.println("Pilha vazia!");

        }
    }

    public int tamanho() {

        int tam = 0;
        No no = topo;
        if (topo == null)
                return tam; //pilha vazia: nenhum nó foi adicionado
        while (no.prox != null) {
            no = no.prox;
            tam++;
        }
        return ++tam;

    }


    public void limpa() {

        while (topo != null)
            remove();
    }


    public int retornaTopo() {
        return topo.conteudo;

    }
}


