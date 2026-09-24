package desafio1.Encapsulamento;

public class Aluno {

    private String nome;
    private double[] notas;

    // Construtor

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    // Getter do nome

    public String getNome() {
        return nome;
    }

    // Setter do nome

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter das notas

    public double[] getNotas() {
        return notas;
    }

    // Setter das notas

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    // Método para calcular a média

    public double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        return media;
    }
}