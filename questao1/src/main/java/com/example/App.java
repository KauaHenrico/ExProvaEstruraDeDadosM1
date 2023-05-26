package com.example;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] intersecao = IntersecaoArrays.encontrarIntersecao(arr1, arr2);

        System.out.println("Interseção: ");
        System.out.println(Arrays.toString(intersecao)); // Saída: []

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {4, 5, 6, 7};

        System.out.println("Interseção: ");
        int[] intersecao2 = IntersecaoArrays.encontrarIntersecao(arr3, arr4);

        System.out.println(Arrays.toString(intersecao2)); // Saída: [4, 5]
    }
}
