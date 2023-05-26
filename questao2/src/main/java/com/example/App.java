package com.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        float[] arr = {4.5f, 2.3f, 6.7f, 1.2f, 9.0f};

        SelectionSort selectionSort = new SelectionSort(arr);
        selectionSort.selectionSort();

        System.out.println(Arrays.toString(arr)); // Output: [1.2, 2.3, 4.5, 6.7, 9.0]
    }
}

class SelectionSort {
    private float[] valor;

    public SelectionSort(float[] arr) {
        this.valor = arr;
    }

    public void selectionSort() {
        for (int i = valor.length - 1; i >= 1; i--) {
            int maior = this.posMaior(i);
            if (maior != i)
                this.troca(i, maior);
        }
    }

    private int posMaior(int fim) {
        int maior = fim;
        for (int i = fim - 1; i >= 0; i--) {
            if (valor[i] > valor[maior])
                maior = i;
        }
        return maior;
    }

    private void troca(int a, int b) {
        float aux;
        aux = valor[a];
        valor[a] = valor[b];
        valor[b] = aux;
    }
}
