package br.com.dio;

import java.util.Scanner;

public class Variável {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        System.out.println("Digite um número: ");
        a = scan.nextInt();

        variavelAceita(a);
    }
    private static void variavelAceita(int i) {
        switch (i) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("Certo");
                break;
            case 4 :
                System.out.println("Errado");
                break;
            case 5 :
                System.out.println("Talvez");
                break;
            default :
                System.out.println("Valor Indefinido");
                break;
        }
    }
}
