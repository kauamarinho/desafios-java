package desafio4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // ABSTRACAO: nao compila, Audio e abstrata.
        // Audio a = new Audio("x", 10, LocalDate.now());

        // Criando os objetos (HERANCA: Musica e Podcast sao Audios)
        Musica bohemian = new Musica("Bohemian Rhapsody", 354, LocalDate.of(1975, 10, 31),
                "Queen", "A Night at the Opera", "Rock");
        Musica blinding = new Musica("Blinding Lights", 200, LocalDate.of(2019, 11, 29),
                "The Weeknd", "After Hours", "Pop");
        Podcast devTalks = new Podcast("Introducao a POO", 1800, LocalDate.of(2024, 3, 10),
                "Ana Souza", "Conceitos basicos de orientacao a objetos", 12);

        // ENCAPSULAMENTO: o estado so muda por metodos (nao ha setters)
        System.out.println("--- Reproduzindo e curtindo ---");
        for (int i = 0; i < 3; i++) {
            bohemian.reproduzir();
        }
        blinding.reproduzir();
        devTalks.reproduzir();
        devTalks.reproduzir();
        for (int i = 0; i < 3; i++) {
            bohemian.curtir();
            devTalks.curtir();
        }

        // POLIMORFISMO: mesmos numeros (3 reproducoes / 3 curtidas), regras diferentes = notas diferentes
        System.out.println("\n--- Classificacao (cada tipo tem sua regra) ---");
        System.out.println(bohemian);
        System.out.println(blinding);
        System.out.println(devTalks);

        // INTERFACE como tipo: Recomendacao so conhece Classificavel

        System.out.println("\n--- Recomendacao ---");
        System.out.println(bohemian.getTitulo() + ": " + Recomendacao.avaliar(bohemian));
        System.out.println(blinding.getTitulo() + ": " + Recomendacao.avaliar(blinding));
        System.out.println(devTalks.getTitulo() + ": " + Recomendacao.avaliar(devTalks));

        // COMPOSICAO + POLIMORFISMO: a playlist "tem" audios e toca cada um do seu jeito

        System.out.println();
        Playlist playlist = new Playlist("Estudando Java");
        playlist.adicionar(bohemian);
        playlist.adicionar(devTalks);
        playlist.adicionar(blinding);

        int total = playlist.getDuracaoTotalEmSegundos();
        System.out.println("Duracao total: " + (total / 60) + " min " + (total % 60) + " s");
        playlist.reproduzir();
        playlist.pausar();
    }
}
