package com.cebin;


public class Stack {

    public Node top;


    public Stack() {
        top = null;
    }

    public void add(int content) {
        Node node = new Node(content);
        node.next = top;
        top = node;

    }

    public void remove() {
        //se pilha nao vazia
        if (top != null) {
            Node node = top;
            top = top.next;
            node.next = null;
        } else {
            top = null;
        }
    }

    public int size() {

        int tam = 0;
        Node node = top;
        if (top == null) {
            return tam; //pilha vazia: nenhum nó foi adicionado
        }
        while (node.next != null) {
            node = node.next;
            tam++;
        }
        tam++;
        return tam;

    }

    public void clean() {
        top = null;
    }


    public int returnTop() {
        if (top != null) {
                return top.content;
        }
        return -1;
    }


}


