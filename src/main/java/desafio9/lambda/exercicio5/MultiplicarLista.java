package desafio9.lambda.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class MultiplicarLista {
    public static void main(String[] args) {

        // List.of() cria uma lista imutável, por isso ela é copiada para um ArrayList

        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Antes:  " + numeros);

        // replaceAll() recebe um UnaryOperator: troca cada elemento pelo resultado da lambda
        numeros.replaceAll(n -> n * 3);

        System.out.println("Depois: " + numeros); // [3, 6, 9, 12, 15]
    }
}
