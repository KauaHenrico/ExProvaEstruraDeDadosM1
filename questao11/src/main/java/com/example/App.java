package com.example;
public class App {
    public static void main(String[] args) {
        int[] vetor = {7, 1, 1, 3, 2};

        bubbleSort(vetor);
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

            System.out.print("Passo " + (i + 1) + ": ");
            printArray(vetor);

            if (!trocou) {
                break;
            }
        }
    }

    public static void troca(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void printArray(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
