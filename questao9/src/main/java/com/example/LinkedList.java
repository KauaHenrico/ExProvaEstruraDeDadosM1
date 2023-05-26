package com.example;

public class LinkedList {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // Lista vazia, o novo nó será o único nó na lista
            head = newNode;
        } else {
            // O novo nó deve ser inserido no final da lista
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void bubbleSort() {
        if (head == null || head.next == null) {
            // Lista vazia ou com apenas um elemento, não é necessário ordenar
            return;
        }

        boolean swapped;
        Node current;
        Node next = null;

        do {
            swapped = false;
            current = head;

            while (current.next != next) {
                if (current.data > current.next.data) {
                    // Troca os nós adjacentes
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            next = current;
        } while (swapped);
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
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
