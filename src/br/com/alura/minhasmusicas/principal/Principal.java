package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner formulario = new Scanner(System.in);
        Musica minhaMusica = new Musica();
        System.out.println("MÚSICA :");
        System.out.println("Informe o título da música:");
        minhaMusica.setTitulo(formulario.nextLine());
        System.out.println("Informe o nome do artista:");
        minhaMusica.setCantor(formulario.nextLine());

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        System.out.println("PODCAST :");
        System.out.println("Informe o nome do título:");
        meuPodcast.setTitulo(formulario.nextLine());
        System.out.println("Informe o nome do artista:");
        meuPodcast.setApresentador(formulario.nextLine());

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        System.out.println("**********************************************************************");
        preferidas.inclui(minhaMusica);
        System.out.println("**********************************************************************");
        preferidas.inclui(meuPodcast);
        System.out.println("**********************************************************************");

    }
}
