package br.com.dio.set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ArcoIris {
    public static void main(String[] args) {
        Set<AIris> arcoIris = new HashSet<>() {{
            add(new AIris("vermelha"));
            add(new AIris("laranja"));
            add(new AIris("amarelo"));
            add(new AIris("verde"));
            add(new AIris("azul"));
            add(new AIris("anil"));
            add(new AIris("violeta"));
        }};

        System.out.println("Cores do arco-íris: ");
        for (AIris aIris: arcoIris) {
            System.out.println(aIris.getCores()); // saída das cores em ordem aleatória
        }
        System.out.println("\nO arco-íris tem " + arcoIris.size() + " cores.\n"); // quantidade de cores do arco-íris

        System.out.println("Cores do arco-íris em ordem alfabética: "); // saída das cores em ordem alfabética
        Set<AIris> arcoIris1 = new TreeSet<>(arcoIris);
        for (AIris aIris: arcoIris1) {
            System.out.println(aIris.getCores()); // saída das cores em ordem alfabética
        }

        Set<String> arcoIris2 = new LinkedHashSet<>(
                Arrays.asList("vermelha", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        List<String> aIrisList = new ArrayList<>(arcoIris2); // passa de Set para List
        Collections.reverse(aIrisList); // inverte a ordem informada
        System.out.println("\nCores do arco-íris na ordem inversa da que foi informada:\n " + aIrisList); // saída das
        // cores na ordem inversa

        System.out.println("\nCores do arco-íris que começam com 'v': \n");
        for (String cor:  arcoIris2) {
            if (cor.startsWith("v")) System.out.println(cor); // exibe cores do arco-iris que começam com "v"
        }

        System.out.println("\nCores do arco-íris que não começam com 'v': ");
        Iterator<String> iterator = arcoIris2.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("v")) iterator.remove(); // remove cores que não começam com "v"
        }
        System.out.println(arcoIris2); // saída cores q não começam com "v"

        arcoIris2.clear(); // limpa o conjunto

        System.out.println("\nConfira se o conjunto está vazio: " + arcoIris2.isEmpty()); // confere se o conjunto
        // está vazio = true

    }
}

class AIris implements Comparable<AIris>{
    private String cores;

    public AIris(String cores) {
        this.cores = cores;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AIris aIris = (AIris) o;
        return Objects.equals(cores, aIris.cores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores);
    }

    @Override
    public String toString() {
        return "AIris{" +
                "cores='" + cores + '\'' +
                '}';
    }

    @Override
    public int compareTo(AIris aIris) {
        return this.getCores().compareToIgnoreCase(aIris.getCores()); // para saída das cores em ordem alfabética
    }
}
