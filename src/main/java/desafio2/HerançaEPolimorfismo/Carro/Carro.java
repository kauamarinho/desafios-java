package desafio2.HerançaEPolimorfismo.Carro;

public class Carro {

    private String modelo;
    private String cor;
    public double preco;


    public Carro(String modelo, String cor, double preco) {

    this.modelo = modelo;
    this.cor = cor;
    this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
