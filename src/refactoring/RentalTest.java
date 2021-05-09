package refactoring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RentalTest {
    private final String MOVIETITLE = "Napoleon Dynamite";
    private final int PRICECODE = 2;
    private final int RENTALDURATION = 7;
    private Movie movie;
    private Rental rental;

    @BeforeEach
    void setUp() {
        movie = new Movie(MOVIETITLE, PRICECODE);
        rental = new Rental(movie, RENTALDURATION);
    }

    @Test
    void getDaysRented() {
        assertEquals(7, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        assertTrue(movie.getTitle() == rental.getMovie().getTitle());
        assertTrue(movie.getPriceCode() == rental.getMovie().getPriceCode());
    }

}
