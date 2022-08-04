package br.com.dio.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //System.out.println(vetor.length); //comando para saber o tamanho do vetor
        System.out.print("Vetor: ");

        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " "); //comando para mostrar o vetor
            count++;
        }

        System.out.print("\nVetor na ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " "); //comando para mostrar o vetor na ordem inversa
        }
    }
}
