package com.example;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);

        list.imprimeRec(); // Imprime os números da lista recursivamente: 1 2 3 4 5
    }
}
