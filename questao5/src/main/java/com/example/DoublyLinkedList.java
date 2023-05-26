package com.example;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public int nroPares() {
        int count = 0;
        Node current = head;

        while (current != null) {
            if (current.data % 2 == 0) {
                count++;
            }
            current = current.next;
        }

        return count;
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
