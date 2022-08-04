package br.com.dio.set;

import java.util.*;
import java.util.Comparator;


public class LinguagemFav {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagemFav = new HashSet<>() {{
            add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
            add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
            add(new LinguagemFavorita("C++", 1979, "CodeBlocks"));
        }};

        // para organizar por ordem de inserção
        Set<LinguagemFavorita> linguagemFav1 = new LinkedHashSet<>(
            Arrays.asList(
                    new LinguagemFavorita("JavaScript", 1995, "VSCode"),
                    new LinguagemFavorita("Java", 1995, "IntelliJ"),
                    new LinguagemFavorita("C++", 1979, "CodeBlocks")
            ));
        // saída por ordem de inserção
        System.out.println("Minhas linguagens favoritas: ");
        for (LinguagemFavorita linguagemFavorita: linguagemFav1) {
            System.out.println(linguagemFavorita);
        }
        // saída por ordem natural/alfabética
        System.out.println("\nLinguagens favoritas em ordem alfabética: ");
        Set<LinguagemFavorita> linguagemFav2 = new TreeSet<>(linguagemFav);
        for (LinguagemFavorita linguagemFavorita:linguagemFav2) {
            System.out.println(linguagemFavorita);
        }
        // saída por ordem de IDE
        System.out.println("\nLinguagens favoritas por ordem de IDE: ");
        Set<LinguagemFavorita> linguagemFav3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        linguagemFav3.addAll(linguagemFav);
        for (LinguagemFavorita linguagemFavorita : linguagemFav3) System.out.println(linguagemFavorita);

        // saída por ordem de criação e nome
        System.out.println("\nLinguagens favoritas em ordem do ano de criação e nome: ");
        Set<LinguagemFavorita> linguagemFav4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        linguagemFav4.addAll(linguagemFav);
        for (LinguagemFavorita linguagemFavorita : linguagemFav4) System.out.println(linguagemFavorita);

        // saída por ordem de nome, ano de criação e IDE
        System.out.println("\nLinguagens favoritas em ordem de nome, ano de criação e IDE: ");
        Set<LinguagemFavorita> linguagemFav5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        linguagemFav5.addAll(linguagemFav3);
        for (LinguagemFavorita linguagemFavorita : linguagemFav5) System.out.println(linguagemFavorita);
    }
}
class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().compareToIgnoreCase(linguagemFavorita.getNome()); // para saída das cores
        // em ordem alfabética/natural
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}
class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}