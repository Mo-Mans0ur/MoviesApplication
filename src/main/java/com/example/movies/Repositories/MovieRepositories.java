package com.example.movies.Repositories;

import com.example.movies.Models.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieRepositories {


    //shall read the file and create an object
    public ArrayList<Movie> getMovies() {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        FileReader reader;

        {
            try {
                reader = new FileReader("src/main/resources/imdb-data.csv");

                Scanner scanner = new Scanner(reader);

                while (scanner.hasNext()) {
                    String moviesDetails = scanner.nextLine();

                    String[] stringsOfMovies = moviesDetails.split(";");


                    int year = Integer.parseInt(stringsOfMovies[0]);
                    int length = Integer.parseInt(stringsOfMovies[1]);
                    String title = stringsOfMovies[2];
                    String subject = stringsOfMovies[3];
                    int popularity = Integer.parseInt(stringsOfMovies[4]);
                    String hasWonAward = stringsOfMovies[5];

                    Movie movieClass = new Movie(year,length,title,subject,popularity,hasWonAward);

                    movies.add(movieClass);


                }

            } catch (FileNotFoundException e) {
                System.out.println("not found");
                e.printStackTrace();
            }


        }
        return movies;
    }

}
