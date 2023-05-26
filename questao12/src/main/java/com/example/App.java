package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static int calcularSoma(int m, int n) {
        if (n == m) {
            return m;
        } else {
            return m + calcularSoma(m + 1, n);
        }
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 5;
        int resultado = calcularSoma(m, n);
        System.out.println("A soma dos números inteiros de " + m + " a " + n + " é: " + resultado);
    }
}
