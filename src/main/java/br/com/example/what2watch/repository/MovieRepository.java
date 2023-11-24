package br.com.example.what2watch.repository;

import br.com.example.what2watch.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
