package com.example;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] vetor = {3, 7, 1, 4, 9, 2};

        System.out.println("Bubble Sort:");
        bubbleSort(vetor.clone());

        System.out.println("\nSelection Sort:");
        selectionSort(vetor.clone());

        System.out.println("\nInsertion Sort:");
        insertionSort(vetor.clone());
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca(vetor, j, j + 1);
                    trocou = true;
                }
            }

            if (!trocou) {
                break;
            }

            System.out.println("Passo " + (i + 1) + ": " + Arrays.toString(vetor));
        }
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            if (indiceMinimo != i) {
                troca(vetor, i, indiceMinimo);
                System.out.println("Passo " + (i + 1) + ": " + Arrays.toString(vetor));
            }
        }
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = chave;

            System.out.println("Passo " + i + ": " + Arrays.toString(vetor));
        }
    }

    public static void troca(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
