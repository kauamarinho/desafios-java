package desafio9.lambda.exercicio7;

import java.util.function.IntBinaryOperator;

public class Divisao {
    public static void main(String[] args) {
        IntBinaryOperator dividir = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Não é possível dividir por zero");
            }
            return a / b;
        };

        System.out.println("10 / 2 = " + dividir.applyAsInt(10, 2)); // 5

        // a exceção lançada dentro da lambda chega até aqui, onde é tratada
        try {
            dividir.applyAsInt(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
