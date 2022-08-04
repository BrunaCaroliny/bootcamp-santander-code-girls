package br.com.dio;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String diaSemana;

        System.out.println("Digite o dia da semana: ");
        diaSemana = scan.next();

        diaDaSemana(diaSemana);
    }
    private static void diaDaSemana(String dia){
        switch (dia) {
            case "domingo":
                System.out.println("Dia 1");
                break;
            case "segunda":
                System.out.println("Dia 2");
                break;
            case "terça":
                System.out.println("Dia 3");
                break;
            case "quarta":
                System.out.println("Dia 4");
                break;
            case "quinta":
                System.out.println("Dia 5");
                break;
            case "sexta":
                System.out.println("Dia 6");
                break;
            case "sábado":
                System.out.println("Dia 7");
                break;

        }
    }
}
