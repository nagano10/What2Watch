package br.com.example.what2watch.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Movie {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String title;

    @Size(min = 10, message = "Digite no mínimo 10 caracteres.")
    String description;

    @Size(min = 4, message = "Digite no mínimo 4 caracteres.")
    String genre;

}
