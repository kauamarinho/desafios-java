package desafio7.exercicio4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Mouse", 80.00));
        produtos.add(new Produto("Teclado", 150.00));

        double soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }

        double media = soma / produtos.size();

        System.out.println("Soma dos preços: " + soma);
        System.out.println("Preço médio: " + media);
    }
}
