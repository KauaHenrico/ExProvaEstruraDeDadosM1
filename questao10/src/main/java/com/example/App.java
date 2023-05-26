package com.example;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 4, 9, 2};

        System.out.println("Vetor original: " + Arrays.toString(array));

        // Bubble Sort
        bubbleSort(array.clone());

        // Selection Sort
        selectionSort(array.clone());

        // Insertion Sort
        insertionSort(array.clone());
    }

    public static void bubbleSort(int[] array) {
        System.out.println("\nBubble Sort:");
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    System.out.println(Arrays.toString(array));
                }
            }
            if (!swapped) {
                // Array is already sorted, break the loop
                break;
            }
        }
    }

    public static void selectionSort(int[] array) {
        System.out.println("\nSelection Sort:");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void insertionSort(int[] array) {
        System.out.println("\nInsertion Sort:");
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            System.out.println(Arrays.toString(array));
        }
    }
}
