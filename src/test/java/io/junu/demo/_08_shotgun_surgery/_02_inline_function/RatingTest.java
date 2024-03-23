package io.junu.demo._08_shotgun_surgery._02_inline_function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatingTest {

    @Test
    void rating() {
        Rating rating = new Rating();
        assertEquals(2, rating.rating(new Driver(6)));
        assertEquals(1, rating.rating(new Driver(4)));
    }
}