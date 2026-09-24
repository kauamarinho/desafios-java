package desafio2.HerançaEPolimorfismo.ContaBancaria;

public class Main {

    public static void main(String[] args) {

        // Criando uma conta corrente

        ContaCorrente conta = new ContaCorrente(
                1234,
                1000,
                "Kaua"
        );

        // Exibindo os dados da conta

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        // Realizando um depósito

        conta.depositar(500);

        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        // Realizando um saque

        conta.sacar(200);

        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        // Cobrando a tarifa mensal

        conta.cobrarTarifaMensal();

        System.out.println("Saldo após tarifa: R$ " + conta.getSaldo());

    }
}
