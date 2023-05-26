package com.example;
import java.util.ArrayList;

public class IntersecaoArrays {
    public static int[] encontrarIntersecao(int[] arr1, int[] arr2) {
        ArrayList<Integer> intersecao = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersecao.add(arr1[i]);
                    break;
                }
            }
        }

        int[] resultado = new int[intersecao.size()];
        for (int i = 0; i < intersecao.size(); i++) {
            resultado[i] = intersecao.get(i);
        }

        return resultado;
    }
}
