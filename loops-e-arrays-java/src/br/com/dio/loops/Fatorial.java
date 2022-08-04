package br.com.dio.loops;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroFatorial, multiplicacao;
        multiplicacao = 1;

        System.out.println("Digite um número: ");
        numeroFatorial = scan.nextInt(); // entrada para o fatorial

        fatorial(numeroFatorial, multiplicacao);
    }
    private static void fatorial(int numero, int multiplicacao) {
        for (int i = numero; i >= 1; i--) {
            multiplicacao = multiplicacao * i; // multiplicacao para fatorial
        }
        System.out.println("Fatorial: " + numero + "!= " + multiplicacao);
    }
}
