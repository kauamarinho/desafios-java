package desafio6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Exercício 1 e 3: lista de produtos criados com o construtor

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook", 3500.00, 5));
        produtos.add(new Produto("Mouse", 80.00, 20));
        produtos.add(new Produto("Teclado", 150.00, 10));

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Primeiro produto: " + produtos.get(0));

        // Exercício 2: imprime a lista usando o toString()

        System.out.println("Lista completa: " + produtos);

        // Exercício 4: produto perecível (herança + super)

        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 6.50, 30, "15/12/2026");
        System.out.println("Produto perecível: " + leite);
    }
}
