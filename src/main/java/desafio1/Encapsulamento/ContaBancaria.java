package desafio1.Encapsulamento;

public class ContaBancaria {

    private double numeroConta;
    private double saldo;
    public String titular;

    // Construtor

    public ContaBancaria(double numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Getter - consulta o saldo - sem parametro

    public double getSaldo() {
        return saldo;
    }

    // Setter - modifica o saldo - com parametro

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}