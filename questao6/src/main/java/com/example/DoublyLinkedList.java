package com.example;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void addOrdenado(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // Lista vazia, o novo nó será o único nó na lista
            head = newNode;
            tail = newNode;
        } else if (data <= head.data) {
            // O novo nó deve ser o novo head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (data >= tail.data) {
            // O novo nó deve ser o novo tail
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            // O novo nó deve ser inserido no meio da lista
            Node current = head;

            while (current != null && data > current.data) {
                current = current.next;
            }

            // Inserindo o novo nó antes do nó atual
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
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
