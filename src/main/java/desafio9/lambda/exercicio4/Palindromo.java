package desafio9.lambda.exercicio4;

import java.util.function.Predicate;

public class Palindromo {
    public static void main(String[] args) {

        // Predicate<String>: recebe uma String e devolve true ou false
        // StringBuilder.reverse() inverte o texto; se for igual ao original, é palíndromo

        Predicate<String> verificarPalindromo = str -> new StringBuilder(str).reverse().toString().equals(str);

        System.out.println(verificarPalindromo.test("arara")); // true
        System.out.println(verificarPalindromo.test("java"));  // false
    }
}
