package br.com.dio.loops;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50 */

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número entre 1 e 10 que deseja saber a tabuada: ");
        numero = scan.nextInt();

        while (numero < 1 | numero > 10) {
            System.out.println("Número inválido. Digite um número entre 1 e 10: ");
            numero = scan.nextInt();
        }

        tabuadaInt(numero);

    }
    private static void tabuadaInt(int numero) {
        System.out.println("Tabuada de " + numero);

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
