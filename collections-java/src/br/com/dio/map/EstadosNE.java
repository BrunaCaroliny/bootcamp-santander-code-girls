package br.com.dio.map;

import java.util.*;

public class EstadosNE {
    public static void main(String[] args) {
        Map<String, Double> estadosNE = new HashMap<>(){{ // dicionário relacionando estado e populaçao
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534265d);
        }};
        System.out.println("Estado\t --- \tPopulacao\t");
        System.out.println(estadosNE.toString()); // imprimir os dados de forma aleatória

        System.out.println("\nEstado\t --- \tPopulacao\t --- \tRN atualizado");
        estadosNE.put("RN", 3534165d); // substituir a população do RN por 3.534.165
        System.out.println(estadosNE.toString());

        boolean pb = estadosNE.containsKey("PB");// saber se o estado PB está no dicionário
        System.out.println("\nPB esta no dicionario? " + pb); // resultado: false, então não tem
        estadosNE.put("\nPB", 4039277d); // adicionando PB
        System.out.println("\nEstado\t --- \tPopulacao\t --- \tPB atualizado");
        System.out.println(estadosNE.toString());

        System.out.println("\nExiba a populacao de PE: " + estadosNE.get("PE")); // exibir a pop de PE

        Map<String, Double> estadosNE1 = new LinkedHashMap<>(){{ // ordem de inserção
            put("PE", 9616621d);
            put("AL", 3351543d);
            put("CE", 9187103d);
            put("RN", 3534165d);
            put("PB", 4039277d);
        }};
        System.out.println("\nEstado\t --- \tPopulacao\t");
        System.out.println(estadosNE1.toString()); // imprimir os dados na ordem de inserção

        Map<String, Double> estadosNE2 = new TreeMap<>(estadosNE1); // ordem natural/alfabética
        System.out.println("\nEstado\t --- \tPopulacao\t --- \tOrdem alfabetica");
        System.out.println(estadosNE2.toString()); // imprimir os dados na ordem alfabética

        // exiba o estado com a menor população
        Double menorPop = Collections.min(estadosNE1.values());
        String estadoMenorPop = "";
        for (Map.Entry<String, Double> entry: estadosNE1.entrySet()) {
            if (entry.getValue().equals(menorPop)) {
                estadoMenorPop = entry.getKey();
                System.out.println("\nEstado com menor populacao: " + estadoMenorPop + " - " + menorPop);
            }
        }
        // exiba o estado com a maior população
        Double maiorPop = Collections.max(estadosNE1.values());
        String estadoMaiorPop = "";
        for (Map.Entry<String, Double> entry: estadosNE1.entrySet()) {
            if (entry.getValue().equals(maiorPop)) {
                estadoMaiorPop = entry.getKey();
                System.out.println("\nEstado com maior populacao: " + estadoMaiorPop + " - " + maiorPop);
            }
        }

        // exiba a soma das populações dos estados do dicionario
        Iterator<Double> iterator = estadosNE1.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nA soma das populacoes dos estados é: " + soma);
        System.out.println("\nA média das populacoes dos estados é: " + (soma/estadosNE1.size())); // media da pop dos estados

        // remova os estados com pop menor que 4.000.000
        Iterator<Double> iterator1 = estadosNE1.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() > 4000000d) iterator1.remove();
        }
        System.out.println("\nEstados com populacao menor que 4.000.000: " + estadosNE1); // estados com pop menor que 4.000.000

        System.out.println("\nApague o dicionario: ");
        estadosNE1.clear(); // dicionario apagado

        System.out.println("\nO dicionario foi apagado? " + estadosNE1.isEmpty());
    }
}

