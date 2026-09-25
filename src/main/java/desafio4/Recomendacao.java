package desafio4;

// O parametro e a INTERFACE Classificavel, nao Audio.
// Esta classe nao sabe (nem precisa saber) o que e Musica ou Podcast: so que tem nota.
// Amanha uma Playlist ou Artista poderia ser Classificavel e funcionaria aqui sem mudar nada.

public class Recomendacao {

    public static String avaliar(Classificavel item) {
        int nota = item.getClassificacao();
        if (nota >= 4) return "Destaque";
        if (nota == 3) return "Popular";
        return "Descubra";
    }
}
