package desafio8.exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Vingadores"));
        titulos.add(new Titulo("Duna"));
        titulos.add(new Titulo("O Poderoso Chefão"));
        titulos.add(new Titulo("Matrix"));

        Collections.sort(titulos);

        System.out.println("Títulos em ordem alfabética:");
        for (Titulo titulo : titulos) {
            System.out.println("- " + titulo);
        }
    }
}
