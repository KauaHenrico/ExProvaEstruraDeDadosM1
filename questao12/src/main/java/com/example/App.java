package com.example;

public class App {
        public static int calcularFatorial(int n) {
            if (n == 0) {
                return 1; /* Caso base: fatorial de 0 é igual a 1 */
            } else {
                return n * calcularFatorial(n - 1); /* Chamada recursiva: n! = n * (n - 1)! */
            }
        }
    
        public static void main(String[] args) {
            int n = 5;
            int resultado = calcularFatorial(n);
            System.out.println("O fatorial de " + n + " é: " + resultado);
        }
    /* Justificativa da escolha da implementação recursiva: A implementação recursiva é escolhida porque a definição matemática do fatorial é naturalmente recursiva, onde n! = n * (n-1)!.
    A implementação recursiva reflete diretamente essa definição, tornando o código mais legível e compreensível. Para valores pequenos de n, a diferença de desempenho entre a implementação recursiva e a iterativa é insignificante. 
    No entanto, em termos de eficiência, a implementação iterativa é geralmente mais eficiente para cálculos de fatorial. A implementação recursiva envolve chamadas de função adicionais e alocação de memória para manter a pilha de chamadas, o que pode ser custoso em termos de tempo de execução e uso de recursos. 
    Em casos onde n é muito grande, a implementação recursiva pode ser menos eficiente e levar a um estouro de pilha (stack overflow). 
    A escolha entre a implementação recursiva e a implementação iterativa depende do contexto do problema, das necessidades específicas e das restrições de eficiência. */
}

    