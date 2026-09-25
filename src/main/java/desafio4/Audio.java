package desafio4;

import java.time.LocalDate;

// CLASSE ABSTRATA: representa o conceito geral de "audio", mas nao pode ser instanciada.
// Nao existe um "audio puro" no Spotify: sempre e uma musica, um podcast, etc.
// Ela guarda o que e COMUM a todos os tipos (HERANCA) e obriga os filhos a definirem
// o que muda (getClassificacao).

public abstract class Audio implements Reproduzivel, Classificavel {

    // ENCAPSULAMENTO: tudo private. Ninguem de fora mexe direto nos dados.

    private final String titulo;
    private final int duracaoEmSegundos;
    private final LocalDate dataLancamento;
    private int totalReproducoes;
    private int curtidas;

    public Audio(String titulo, int duracaoEmSegundos, LocalDate dataLancamento) {
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.dataLancamento = dataLancamento;

        // totalReproducoes e curtidas comecam em 0: um audio novo nunca foi tocado nem curtido.
    }

    // Getters: leitura liberada.

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    // Repare: NAO existe setCurtidas nem setTotalReproducoes.
    // O estado so muda por comportamentos (curtir/reproduzir), que garantem regras validas.
    // Ninguem consegue, por exemplo, colocar curtidas = -50.
    public void curtir() {
        curtidas++;
    }

    @Override
    public void reproduzir() {
        totalReproducoes++;
        System.out.println("Tocando: " + titulo + " (" + getDuracaoFormatada() + ")");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado: " + titulo);
    }

    // Metodo auxiliar que transforma 354 segundos em "5:54".
    public String getDuracaoFormatada() {
        return (duracaoEmSegundos / 60) + ":" + String.format("%02d", duracaoEmSegundos % 60);
    }

    // ABSTRACAO: metodo herdado de Classificavel, que Audio NAO implementa.
    // Cada subclasse e obrigada a escrever a sua propria regra.

    @Override
    public abstract int getClassificacao();

    @Override
    public String toString() {
        return titulo + " | " + getDuracaoFormatada()
                + " | lancado em " + dataLancamento
                + " | " + totalReproducoes + " reproducoes"
                + " | " + curtidas + " curtidas"
                + " | nota " + getClassificacao();
    }
}
