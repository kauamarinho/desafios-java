package desafio9.lambda.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class OrdenarStrings {
    public static void main(String[] args) {
        List<String> linguagens = new ArrayList<>(List.of("Java", "Python", "CSharp", "JavaScript"));
        System.out.println("Antes:  " + linguagens);

        // sort() recebe um Comparator: a lambda compara dois elementos (a, b)
        // compareTo() devolve negativo se a vem antes de b, positivo se vem depois e 0 se são iguais

        linguagens.sort((a, b) -> a.compareTo(b));

        System.out.println("Depois: " + linguagens); // [CSharp, Java, JavaScript, Python]
    }
}
