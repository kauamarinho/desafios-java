package desafio7.exercicio5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5));
        formas.add(new Quadrado(4));
        formas.add(new Circulo(2));

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
