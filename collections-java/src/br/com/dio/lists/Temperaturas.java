package br.com.dio.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Temperaturas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<Double>();
        System.out.println("Informe a temperatura média dos 6 primeiros meses do ano: ");
        temperaturas.add(scan.nextDouble()); // recebe as temperaturas
        temperaturas.add(scan.nextDouble());
        temperaturas.add(scan.nextDouble());
        temperaturas.add(scan.nextDouble());
        temperaturas.add(scan.nextDouble());
        temperaturas.add(scan.nextDouble());

        System.out.println("\nTemperaturas: \n" + temperaturas.toString() + "\n"); //exibe as temperaturas recebidas
        Iterator<Double> iterator = temperaturas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) { //realiza o somatório das temperaturas
            double next = iterator.next();
            soma += next;
        }

        double media = soma/temperaturas.size(); // calcula a média das temperaturas

        System.out.printf("Média das temperaturas: " + media + "\n"); //exibe a média das temperaturas


        System.out.println("\nOs meses das temperaturas acima da média: ");
        Iterator<Double> compara = temperaturas.iterator(); // para comparar as temperaturas com a média

        int count = 0;
        while (compara.hasNext()) {
            double temp = compara.next(); // a variável temp irá analisar o prox número
            if (temp > media) { // compara se a temperatura é maior que a media
                switch (count) {
                    case (0):
                        System.out.printf("1 - Janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - Fevereiro: %.1f\n ", temp);
                        break;
                    case (2):
                        System.out.printf("3 - Março: %.1f\n ", temp);
                        break;
                    case (3):
                        System.out.printf("4 - Abril: %.1f\n ", temp);
                        break;
                    case (4):
                        System.out.printf("5 - Maio: %.1f\n ", temp);
                        break;
                    case (5):
                        System.out.printf("6 - Junho: %.1f\n ", temp);
                        break;
                }
            }
            count++;
        }

    }
}
