package desafio2.HerançaEPolimorfismo.ContaBancaria;

public class ContaBancaria {

    private double saldo;
    private String titular;
    private double numeroConta;


    public ContaBancaria(double numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    void sacar(double valor){
        this.saldo -= valor;
    }

    void consultarSaldo(double valor){
        this.saldo -= valor;
    }

}


