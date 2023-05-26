package com.example;

public class App {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Exemplo: Calculando o 10º termo da série de Fibonacci
        int resultado = fibonacci(n);
        System.out.println("O " + n + "º termo da série de Fibonacci é: " + resultado);
    }
}
