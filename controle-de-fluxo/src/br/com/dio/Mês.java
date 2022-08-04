package br.com.dio;

import java.util.Scanner;

public class Mês {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.println("Digite o número correspondente ao mês: ");
        i = scan.nextInt();

        ifSemFlecha(i);
    }

    private static void ifSemFlecha(int a) {
        if (a == 1) {
            System.out.println("Janeiro");
        } else if (a == 2) {
            System.out.println("Fevereiro");
        }
        if (a == 3) {
            System.out.println("Março");
        } else if (a == 4) {
            System.out.println("Abril");
        }
        if (a == 5) {
            System.out.println("Maio");
        } else if (a == 6) {
            System.out.println("Junho");
        }
        if (a == 7) {
            System.out.println("Julho - Férias");
        } else if (a == 8) {
            System.out.println("Agosto");
        }
        if (a == 9) {
            System.out.println("Setembro");
        } else if (a == 10) {
            System.out.println("Outubro");
        }
        if (a == 11) {
            System.out.println("Novembro");
        } else if (a == 12) {
            System.out.println("Dezembro");
        }
    }
}

