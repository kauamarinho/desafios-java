package desafio4;

import java.time.LocalDate;

// HERANCA: Musica "e um" Audio. Ganha de graca titulo, duracao, curtir(), reproduzir()...
// e adiciona apenas o que e especifico de musica: artista, album e genero.

public class Musica extends Audio {

    private final String artista;
    private final String album;
    private final String genero;

    public Musica(String titulo, int duracaoEmSegundos, LocalDate dataLancamento,
                  String artista, String album, String genero) {
        super(titulo, duracaoEmSegundos, dataLancamento); // chama o construtor do pai
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    // POLIMORFISMO: a regra de nota da musica olha para as REPRODUCOES.

    @Override
    public int getClassificacao() {
        int plays = getTotalReproducoes(); // filho le o dado do pai pelo getter (campo e private)
        if (plays >= 10) return 5;
        if (plays >= 5) return 4;
        if (plays >= 3) return 3;
        if (plays >= 1) return 2;
        return 1;
    }

    @Override
    public String toString() {
        return artista + " - " + super.toString() + " | album " + album + " | " + genero;
    }
}
