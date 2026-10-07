package desafio9.lambda.exercicio1;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        IntBinaryOperator multiplicar = (a, b) -> a * b;
        System.out.println(multiplicar.applyAsInt(5, 3)); // 15
    }
}

// você usa uma interface que o Java já tem:
//        import java.util.function.IntBinaryOperator;
//
// IntBinaryOperator m = (a, b) -> a * b;
//
// Por dentro, o IntBinaryOperator é praticamente igual ao que você escreveu:
// @FunctionalInterface
// public interface IntBinaryOperator {
//    int applyAsInt(int left, int right);
//}
//
// Então elas fazem com que você não precise criar uma interface
// mas você continua usando uma.