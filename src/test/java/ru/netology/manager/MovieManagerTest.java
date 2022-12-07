package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void shouldAddMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        String[] actual = manager.findLast();
        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastMovieInLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        manager.addMovies("Film 5");
        manager.addMovies("Film 6");
        manager.addMovies("Film 7");
        manager.addMovies("Film 8");
        manager.addMovies("Film 9");
        manager.addMovies("Film 10");

        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindLastMovieAboveLimit() {
        MovieManager manager = new MovieManager();


        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        manager.addMovies("Film 5");
        manager.addMovies("Film 6");
        manager.addMovies("Film 7");
        manager.addMovies("Film 8");
        manager.addMovies("Film 9");
        manager.addMovies("Film 10");
        manager.addMovies("Film 11");

        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
