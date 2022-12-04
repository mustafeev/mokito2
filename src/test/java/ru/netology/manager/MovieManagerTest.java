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

    // @Test
    //public void regular() {
    // MovieManager manager = new MovieManager();
    // manager.addMovies("Film 1");
    //manager.addMovies("Film 2");
    // manager.addMovies("Film 3");
    // manager.addMovies("Film 4");
    //String[] actual = manager.findEquals();
    // String[] expected = {"Film 1"};
    // Assertions.assertArrayEquals(expected, actual);

    //}
}
