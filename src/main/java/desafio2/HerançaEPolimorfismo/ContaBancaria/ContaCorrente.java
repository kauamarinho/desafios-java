package desafio2.HerançaEPolimorfismo.ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double numeroConta, double saldo, String titular) {
        super(numeroConta, saldo, titular);
    }

    public void cobrarTarifaMensal() {
        double saldoComTaxa = getSaldo() * 0.9;

        setSaldo(saldoComTaxa);
    }
}