package ru.netology.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {
@Test
    public void testFindAll() {
    MoviesManager manager = new MoviesManager();
    String movie1 = "Harry Potter1";
    String movie2 = "Harry Potter2";
    String movie3 = "Harry Potter3";
    String movie4 = "Harry Potter4";
    String movie5 = "Harry Potter5";
    String movie6 = "Harry Potter6";
    String movie7 = "Harry Potter7";
    String movie8 = "Harry Potter8";

    manager.add(movie1);
    manager.add(movie2);
    manager.add(movie3);

    String[] actual = manager.findAll();
    String[] expected = {movie1, movie2, movie3};

    Assertions.assertArrayEquals(expected, actual);
}

    @Test
    public void testFindLastWhenLimitEqualsSize() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Harry Potter1";
        String movie2 = "Harry Potter2";
        String movie3 = "Harry Potter3";
        String movie4 = "Harry Potter4";
        String movie5 = "Harry Potter5";
        String movie6 = "Harry Potter6";
        String movie7 = "Harry Potter7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreSize() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Harry Potter1";
        String movie2 = "Harry Potter2";
        String movie3 = "Harry Potter3";
        String movie4 = "Harry Potter4";
        String movie5 = "Harry Potter5";
        String movie6 = "Harry Potter6";
        String movie7 = "Harry Potter7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);


        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSize() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Harry Potter1";
        String movie2 = "Harry Potter2";
        String movie3 = "Harry Potter3";
        String movie4 = "Harry Potter4";
        String movie5 = "Harry Potter5";
        String movie6 = "Harry Potter6";
        String movie7 = "Harry Potter7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitEqualsSizeWithCustomLimit() {
        MoviesManager manager = new MoviesManager(3);
        String movie1 = "Harry Potter1";
        String movie2 = "Harry Potter2";
        String movie3 = "Harry Potter3";
        String movie4 = "Harry Potter4";
        String movie5 = "Harry Potter5";
        String movie6 = "Harry Potter6";
        String movie7 = "Harry Potter7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreSizeWithCustomLimit() {
        MoviesManager manager = new MoviesManager(7);
        String movie1 = "Harry Potter1";
        String movie2 = "Harry Potter2";
        String movie3 = "Harry Potter3";
        String movie4 = "Harry Potter4";
        String movie5 = "Harry Potter5";
        String movie6 = "Harry Potter6";
        String movie7 = "Harry Potter7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);


        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitLessSizeWithCustomLimit() {
        MoviesManager manager = new MoviesManager(3);
        String movie1 = "Harry Potter1";
        String movie2 = "Harry Potter2";
        String movie3 = "Harry Potter3";
        String movie4 = "Harry Potter4";
        String movie5 = "Harry Potter5";
        String movie6 = "Harry Potter6";
        String movie7 = "Harry Potter7";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5};

        Assertions.assertArrayEquals(expected, actual);
    }
}