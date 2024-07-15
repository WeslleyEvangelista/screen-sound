package br.com.weslley_evangelista.screenSound.main;

import br.com.weslley_evangelista.screenSound.model.Artist;
import br.com.weslley_evangelista.screenSound.model.ArtistType;
import br.com.weslley_evangelista.screenSound.repository.ArtistRepository;

import java.util.Scanner;

public class Main {
    private final ArtistRepository repository;
    private Scanner scanner = new Scanner(System.in);

    public Main(ArtistRepository repository) {
        this.repository = repository;
    }

    public void displayMenu() {
        var option = 1;

        while (option != 9) {
            var menu = """
                    *** Screen Sound Musics ***
                    
                    1- Register Artists
                    2- Register musics
                    4- Search musics by artists
                    5- Search artist data
                    
                    9- Exit
                    """;

            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    registerArtists();
                    break;
                case 2:
                    reegisterMusics();
                    break;
                case 3:
                    listMusics();
                    break;
                case 4:
                    searchMusicsByArtist();
                    break;
                case 5:
                    searchArtistData();
                    break;
                case 9:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }

    private void searchArtistData() {
    }

    private void searchMusicsByArtist() {
    }

    private void listMusics() {
    }

    private void reegisterMusics() {
    }

    private void registerArtists() {
        var registerNewArtist = "S";

        while (registerNewArtist.equalsIgnoreCase("s")) {
            System.out.println("Enter artist name you wish to registar: ");
            var name = scanner.nextLine();
            System.out.println("What type is this artist? (solo, duo or band) ");
            var type = scanner.nextLine();
            ArtistType artistType = ArtistType.valueOf(type.toUpperCase());
            Artist artist = new Artist(name, artistType);
            repository.save(artist);
            System.out.println("Do you wish to register a new artist? (Y/N)");
            registerNewArtist = scanner.nextLine();
        }
    }
}
