package desafio2.HerançaEPolimorfismo.Carro;

public class Main {

    public static void main(String[] args) {

        // Criando os objetos

        Carro carro1 = new Carro("Civic", "Preto", 120000);
        Carro carro2 = new Carro("Corolla", "Branco", 110000);

        // Exibindo os dados do primeiro carro

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Preço: R$ " + carro1.getPreco());

        // Exibindo os dados do segundo carro

        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Preço: R$ " + carro2.getPreco());

        // Testando os setters

        carro1.setPreco(115000);
        carro1.setCor("Azul");

        System.out.println("Dados atualizados do carro 1:");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Preço: R$ " + carro1.getPreco());

    }
}