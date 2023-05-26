package com.example;

public class SinglyLinkedList {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void imprimeRec() {
        imprimeRecHelper(head);
    }

    private void imprimeRecHelper(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        imprimeRecHelper(node.next);
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
