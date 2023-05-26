package com.example;

public class App {
    public static void main(String[] args) {
        AlgoritmoA.algoritmoA();
        AlgoritmoB.algoritmoB();
        AlgoritmoC.algoritmoC();
        AlgoritmoD.algoritmoD();
    }
}

class AlgoritmoA {
    public static void algoritmoA() {
        int n = 10; // exemplo de valor para n
        int resultado = 4 * n * n + 3 * n + 2;
        System.out.println("Resultado do Algoritmo A: " + resultado);
    }
}

class AlgoritmoB {
    public static void algoritmoB() {
        int n = 10; // exemplo de valor para n
        int resultado = n + 34;
        System.out.println("Resultado do Algoritmo B: " + resultado);
    }
}

class AlgoritmoC {
    public static void algoritmoC() {
        int n = 10; // exemplo de valor para n
        int resultado = n + 12;
        System.out.println("Resultado do Algoritmo C: " + resultado);
    }
}

class AlgoritmoD {
    public static void algoritmoD() {
        int resultado = 3 + 5;
        System.out.println("Resultado do Algoritmo D: " + resultado);
    }
}
