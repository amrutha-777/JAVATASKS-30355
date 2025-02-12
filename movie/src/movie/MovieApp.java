package movie;

import java.util.ArrayList;
import java.util.List;

public class MovieApp {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("Parasite", 8.6, 2019));
        movies.add(new Movie("Titanic", 7.8, 1997));

        System.out.println("Movies before sorting:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        MovieSorter.sortMovies(movies);

        System.out.println("\nMovies after sorting by year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
