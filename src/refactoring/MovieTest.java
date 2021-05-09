package refactoring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class MovieTest {
    private final String MOVIETITLE = "Napoleon Dynamite";
    private final int PRICECODE = 2;
    private final int PRICECODE2 = 1;

    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie(MOVIETITLE, PRICECODE);
    }

    @Test
    void getPriceCode() {
        assertEquals(PRICECODE, movie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        movie.setPriceCode(PRICECODE2);
        assertEquals(PRICECODE2, movie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals(MOVIETITLE, movie.getTitle());
    }
}
