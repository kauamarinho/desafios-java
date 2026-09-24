package desafio2.HerançaEPolimorfismo.Animal;

public class Main {

    public static void main(String[] args) {

        // Criando os objetos

        Cachorro cachorro = new Cachorro("Rex", 12.5);
        Gato gato = new Gato("Mimi", 4.5);

        // Dados do cachorro

        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Peso: " + cachorro.getPeso() + " kg");

        cachorro.emitirSom();
        cachorro.abanarRabo();


        // Dados do gato

        System.out.println("Nome: " + gato.getNome());
        System.out.println("Peso: " + gato.getPeso() + " kg");

        gato.emitirSom();
        gato.arranharMoveis();

    }
}