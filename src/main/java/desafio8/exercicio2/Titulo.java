package desafio8.exercicio2;

public class Titulo implements Comparable<Titulo> {

    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
