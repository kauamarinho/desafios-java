package desafio2.HerançaEPolimorfismo.Animal;

public class Gato extends Animal {
    public Gato(String nome, double preco) {
        super(nome, preco);
    }

    public void arranharMoveis(){
        System.out.println("Arranhar moveis!");
    }
}