package com.example.movies.Services;

import com.example.movies.Models.Movie;
import com.example.movies.Repositories.MovieRepositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MovieService {
    MovieRepositories movieRepositoriesClass = new MovieRepositories();
    static Random random = new Random();


    public String getFirst() {
        ArrayList<Movie> movies = movieRepositoriesClass.getMovies();
        return (movies.get(0).getTitle());
    }

    public String getRandom() {

        ArrayList<Movie> movies = movieRepositoriesClass.getMovies();

        return movies.get(random.nextInt(movies.size())).getTitle() ;
    }

    public String getTenSortByPopularity() {
        ArrayList<Movie> movies = movieRepositoriesClass.getMovies();
        ArrayList<Movie> moviesPopularity = new ArrayList<Movie>();


        for (int i = 0; i < 10; i++) {
            Movie movie = movies.get(random.nextInt(movies.size()));

            moviesPopularity.add(movie);

        }
        Collections.sort(moviesPopularity);
        return moviesPopularity.toString();
    }

    public String getHowManyWonAnAward() {
        ArrayList<Movie> movies = movieRepositoriesClass.getMovies();
        int numberOfMoviesWithAwards = 0;
        for (int i = 0; i <movies.size(); i++) {

            if (!movies.get(i).isHasWonAward()) {
                numberOfMoviesWithAwards = numberOfMoviesWithAwards + 1;

            }
        }

        return String.valueOf(numberOfMoviesWithAwards);
    }
}
