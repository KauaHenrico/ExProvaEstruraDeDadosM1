package com.example;

public class LDE {
    private Node head;
    private Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // Lista vazia, o novo nó será o único nó na lista
            head = newNode;
            tail = newNode;
        } else {
            // O novo nó deve ser inserido no final da lista
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void concat(LDE l) {
        if (l.head == null) {
            // Se a lista l estiver vazia, não há nada a concatenar
            return;
        }

        if (head == null) {
            // Se a lista atual estiver vazia, basta copiar a lista l
            head = l.head;
            tail = l.tail;
        } else {
            // Caso contrário, concatenamos as listas

            // Atualizamos os ponteiros para o próximo e anterior
            tail.next = l.head;
            l.head.prev = tail;

            // Atualizamos o tail para o último elemento da lista l
            tail = l.tail;
        }
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    private class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
