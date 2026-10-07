package desafio9.lambda.exercicio3;

import java.util.function.UnaryOperator;

public class Maiusculas {
    public static void main(String[] args) {
        // UnaryOperator<String>: recebe uma String e devolve uma String
        UnaryOperator<String> paraMaiusculas = texto -> texto.toUpperCase();

        System.out.println(paraMaiusculas.apply("java")); // JAVA
    }
}
