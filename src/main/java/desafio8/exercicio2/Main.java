package desafio8.exercicio2;

public class Main {

    public static void main(String[] args) {

        Titulo titulo1 = new Titulo("Zootopia");
        Titulo titulo2 = new Titulo("A Origem");

        int resultado = titulo1.compareTo(titulo2);

        System.out.println("Comparando \"" + titulo1 + "\" com \"" + titulo2 + "\": " + resultado);
    }
}
