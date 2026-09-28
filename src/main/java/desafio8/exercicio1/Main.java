package desafio8.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(23);
        numeros.add(5);
        numeros.add(42);
        numeros.add(8);
        numeros.add(15);

        Collections.sort(numeros);

        System.out.println("Números em ordem crescente: " + numeros);
    }
}
