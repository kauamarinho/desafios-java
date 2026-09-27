package desafio7.exercicio1_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Exercício 1: ArrayList de String e loop foreach

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Rex");
        nomes.add("Totó");
        nomes.add("Bidu");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Exercício 2: herança e casting

        Cachorro cachorro = new Cachorro("Rex", 12.5);
        Animal animal = (Animal) cachorro;

        System.out.println(animal.getNome() + " pesa " + animal.getPeso() + "kg");

        // Exercício 3: casting seguro com instanceof

        if (animal instanceof Cachorro) {
            Cachorro cachorroConvertido = (Cachorro) animal;
            System.out.println(cachorroConvertido.getNome() + " é um cachorro válido para casting");
        }
    }
}
