import org.junit.jupiter.api.BeforeEach;
import refactoring.Customer;
import refactoring.Movie;
import refactoring.Rental;

class CustomerTest {
    private final String CUSTOMERNAME = "Franz Gans";
    private final String MOVIETITLE = "Napoleon Dynamite";
    private final int MOVIEPRICE = 2;
    private final int RENTALDURATION = 7;
    private Customer customer;
    private Rental rental;
    private Movie

    @BeforeEach
    void setUp() {
        customer = new Customer(CUSTOMERNAME);

    }
}
