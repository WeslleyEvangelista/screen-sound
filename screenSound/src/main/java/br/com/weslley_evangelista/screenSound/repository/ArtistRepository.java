package br.com.weslley_evangelista.screenSound.repository;

import br.com.weslley_evangelista.screenSound.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
