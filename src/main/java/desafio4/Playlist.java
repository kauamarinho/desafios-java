package desafio4;

import java.util.ArrayList;
import java.util.List;

// COMPOSICAO: Playlist "tem" Audios (relacao "tem um"), diferente de heranca ("e um").
// Ela tambem implementa Reproduzivel: uma playlist pode ser tocada como se fosse um audio.

public class Playlist implements Reproduzivel {

    private final String nome;

    // O tipo da lista e Audio (o pai): cabem Musica, Podcast e qualquer filho futuro.

    private final List<Audio> audios = new ArrayList<>();

    // construtor

    public Playlist(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionar(Audio audio) {
        audios.add(audio);
    }

    public int getDuracaoTotalEmSegundos() {
        int total = 0;
        for (Audio audio : audios) {
            total += audio.getDuracaoEmSegundos();
        }
        return total;
    }

    // POLIMORFISMO em acao: o loop chama audio.reproduzir() sem saber se e Musica ou Podcast.
    // Em tempo de execucao o Java escolhe a versao certa de cada objeto.

    @Override
    public void reproduzir() {
        System.out.println("=== Playlist: " + nome + " ===");
        for (Audio audio : audios) {
            audio.reproduzir();
        }
    }

    @Override
    public void pausar() {
        System.out.println("Playlist pausada: " + nome);
    }
}
