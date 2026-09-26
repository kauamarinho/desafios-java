package desafio4;

import java.time.LocalDate;

// Outro filho de Audio, com atributos e regras proprias.
public class Podcast extends Audio {

    private final String apresentador;
    private final String descricao;
    private final int numeroEpisodio;

    public Podcast(String titulo, int duracaoEmSegundos, LocalDate dataLancamento,
                   String apresentador, String descricao, int numeroEpisodio) {
        super(titulo, duracaoEmSegundos, dataLancamento);
        this.apresentador = apresentador;
        this.descricao = descricao;
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    // SOBRESCRITA (@Override) + super: reaproveita o comportamento do pai
    // (contar reproducao e imprimir "Tocando") e ACRESCENTA algo so do podcast.

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("   Episodio " + numeroEpisodio + " com " + apresentador);
    }

    // POLIMORFISMO: a mesma pergunta (getClassificacao) tem outra resposta aqui.
    // Podcast e avaliado pelas CURTIDAS, nao pelas reproducoes.

    @Override
    public int getClassificacao() {
        int likes = getCurtidas();
        if (likes >= 5) return 5;
        if (likes >= 3) return 4;
        if (likes >= 2) return 3;
        if (likes >= 1) return 2;
        return 1;
    }

    @Override
    public String toString() {
        return "Ep." + numeroEpisodio + " " + super.toString() + " | " + apresentador;
    }
}
