package desafio2.HerançaEPolimorfismo.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    public void abanarRabo() {
        System.out.println("Abanar rabo!");
    }

}