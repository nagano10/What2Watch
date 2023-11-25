package br.com.example.what2watch.controller;

import br.com.example.what2watch.model.Movie;
import br.com.example.what2watch.repository.MovieRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("movie")
public class MovieController {

    @Autowired
    MovieRepository repository;

    @GetMapping
    public String index(Model model){

        var filme = repository.findAll();
        model.addAttribute("movies", filme);
        return "movie/index";

    }

    @GetMapping("new")
    public String form(Movie movie){

        return "movie/form";

    }

    @PostMapping("new")
    public String save(@Valid Movie movie, BindingResult result) {

        if(result.hasErrors()) return "movie/form";

        repository.save(movie);
        return"redirect:/movie";

    }

    @DeleteMapping("{id}") // Passa parametro movie{id}
    public String delete(@PathVariable  Long id){
        repository.deleteById(id);
        return "redirect:/movie";
    }

}
