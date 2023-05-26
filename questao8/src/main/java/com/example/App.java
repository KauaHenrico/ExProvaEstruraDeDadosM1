package com.example;

public class App {
    public static void main(String[] args) {
        LDE list1 = new LDE();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        LDE list2 = new LDE();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        System.out.println("Lista 1:");
        list1.printList();

        System.out.println("Lista 2:");
        list2.printList();

        list1.concat(list2);

        System.out.println("Lista concatenada:");
        list1.printList();
    }
}
