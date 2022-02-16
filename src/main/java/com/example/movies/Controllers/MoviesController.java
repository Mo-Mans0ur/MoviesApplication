package com.example.movies.Controllers;

import com.example.movies.Models.Movie;
import com.example.movies.Services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesController {
    MovieService service = new MovieService();


    @GetMapping("/")
    public String index() {
        return "This App Analysis Movies";
    }

    @GetMapping("getFirst")
    public String firstMovie() {
        return service.getFirst();
    }

    @GetMapping("/getRandom")
    public String getRandomMovie() {
        return service.getRandom();
    }

    @GetMapping("getTenSortByPopularity")
    public String getTenSortByPopularity() {
        return service.getTenSortByPopularity();
    }

    @GetMapping("howManyWonAnAward")
    public String howManyWonAnAward() {
        return service.getHowManyWonAnAward();
    }

}
