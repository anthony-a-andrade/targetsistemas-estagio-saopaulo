/*
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
*/

import java.util.Scanner;

public class ex2 {
    static boolean fib(int n0, int n1, int check) {
        if (n0 == check) return true;
        if (n0 > check) return false;
        return fib(n1, n0 + n1, check);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número... ");
        int num = scanner.nextInt();
        boolean check = fib(0, 1, num);

        System.out.println(String.format("O número %s a sequência de Fibonacci.", check ? "pertence" : "não pertence"));

        scanner.close();
    }
}
