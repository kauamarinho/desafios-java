package desafio7.exercicio6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("001", 1500.00));
        contas.add(new ContaBancaria("002", 4200.50));
        contas.add(new ContaBancaria("003", 980.75));

        ContaBancaria maiorConta = contas.get(0);
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorConta.getSaldo()) {
                maiorConta = conta;
            }
        }

        System.out.println("Conta com maior saldo: " + maiorConta.getNumeroConta() + " - R$" + maiorConta.getSaldo());
    }
}
