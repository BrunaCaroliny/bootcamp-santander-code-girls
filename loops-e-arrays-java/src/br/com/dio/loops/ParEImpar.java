package br.com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros, numero, par, impar;
        par = 0;
        impar = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) par++; // conta a quantidade de números pares
            else impar++; // conta a quantidade de números ímpares

            count++;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade de números pares: " + par); // imprime a quantidade de números pares
        System.out.println("Quantidade de números ímpares: " + impar); // imprime a quantidade de números ímpares

    }

}
