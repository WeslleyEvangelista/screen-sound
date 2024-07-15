package br.com.weslley_evangelista.screenSound;

import br.com.weslley_evangelista.screenSound.main.Main;
import br.com.weslley_evangelista.screenSound.repository.ArtistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenSoundApplication implements CommandLineRunner {

	private ArtistRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ScreenSoundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main= new Main(repository);
		main.displayMenu();
	}
}
