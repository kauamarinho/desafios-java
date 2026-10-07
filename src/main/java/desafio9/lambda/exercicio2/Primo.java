package desafio9.lambda.exercicio2;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Primo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        IntPredicate ehPrimo = (n) -> {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(num + " é primo? " + ehPrimo.test(num));
        input.close();
    }
}
