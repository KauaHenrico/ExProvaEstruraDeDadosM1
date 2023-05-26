package com.example;
public class App {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        

        int nroPares = list.nroPares();
        System.out.println("Número de elementos pares: " + nroPares);
    }
}
