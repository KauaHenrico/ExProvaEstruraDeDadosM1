package com.example;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addOrdenado(2);
        list.addOrdenado(5);
        list.addOrdenado(7);
        list.addOrdenado(10);
        list.addOrdenado(6);

        list.printList(); // Método adicional para imprimir a lista
    }
}
