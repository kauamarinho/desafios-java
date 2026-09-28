package desafio8.exercicio5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        adicionarNomes(nomes);
        imprimir(nomes);

        nomes = new LinkedList<>();
        adicionarNomes(nomes);
        imprimir(nomes);
    }

    private static void adicionarNomes(List<String> lista) {
        lista.add("Ana");
        lista.add("Bruno");
        lista.add("Carla");
    }

    private static void imprimir(List<String> lista) {
        System.out.println(lista.getClass().getSimpleName() + ": " + lista);
    }
}
