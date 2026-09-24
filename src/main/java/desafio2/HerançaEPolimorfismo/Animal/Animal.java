package desafio2.HerançaEPolimorfismo.Animal;

public class Animal {

    private String nome;
    private double peso;

    public Animal(String nome, double preco) {
        this.nome = nome;
        this.peso = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void emitirSom() {
        System.out.println("Som do animal");
    }

}
