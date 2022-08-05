package br.com.dio.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class Interrogatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Responda com 's' para sim e 'n' para não."); // pergunta introdutória
        System.out.println("Telefonou para a vítima? "); // pergunta 1
        respostas.add(scan.next()); // entrada s ou n
        System.out.println("Esteve no local do crime? "); // pergunta 2
        respostas.add(scan.next()); // entrada s ou n
        System.out.println("Mora perto da vítima? "); // pergunta 3
        respostas.add(scan.next()); // entrada s ou n
        System.out.println("Devia para a vítima? "); // pergunta 4
        respostas.add(scan.next()); // entrada s ou n
        System.out.println("Já trabalhou com a vítima? "); // pergunta 5
        respostas.add(scan.next()); // entrada s ou n

        Iterator<String> iterator = respostas.iterator();
        int count = 0; // contador para o número de respostas "Sim", ou seja, 's'
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.contains("s") == true) count++; // .contains serve para saber se tem aquele caractere na String
        }

        //System.out.println(count); // teste para saber se está contando certo

        System.out.println("A pessoa interrogada é: ");
        if (count == 2) {
            System.out.print("Suspeita");
        } else if (count >= 3 & count <= 4) {
            System.out.print("Cúmplice");
        } else if (count == 5) {
            System.out.print("Assassina");
        } else {
            System.out.print("Inocente");
        }

    }
}
