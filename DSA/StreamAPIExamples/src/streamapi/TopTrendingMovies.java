package streamapi;

import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    double rating;
    int releaseYear;

    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
}

public class TopTrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 8.8, 2010),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("Oppenheimer", 8.5, 2023),
                new Movie("The Dark Knight", 9.0, 2008),
                new Movie("Dune", 8.1, 2021),
                new Movie("Avengers Endgame", 8.4, 2019)
        );

        movies.stream()
                .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                        .thenComparing(m -> m.releaseYear, Comparator.reverseOrder())
                        .reversed())
                .limit(5)
                .forEach(m -> System.out.println(m.title + " - " + m.rating + " (" + m.releaseYear + ")"));
    }
}