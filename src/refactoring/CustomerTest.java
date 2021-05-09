package refactoring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    private final String CUSTOMERNAME = "Franz Gans";
    private final String MOVIETITLE = "Napoleon Dynamite";
    private final int PRICECODE = 2;
    private final int RENTALDURATION = 7;
    private Customer customer;
    private Rental rental;
    private Movie movie;

    @BeforeEach
    void setUp() {
        customer = new Customer(CUSTOMERNAME);
        movie = new Movie(MOVIETITLE,PRICECODE);
        rental = new Rental(movie, RENTALDURATION);
    }

    @Test
    void addRental() {
        customer.addRental(rental);
    }

    @Test
    void getName() {
        assertEquals(CUSTOMERNAME, customer.getName());
    }

    @Test
    void statement() {
        customer.addRental(rental);
        String statement = "Rental Record for " + CUSTOMERNAME + "\n" +
                "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n" +
                "\t" + MOVIETITLE + "\t" + "\t" + RENTALDURATION + "\t" + 7.5 + "\n"+
                "Amount owed is " + 7.5 + "\n" +
                "You earned " + 1 + " frequent renter points";

                assertEquals(statement, customer.statement());
    }
    @Test
    void htmlStatement() {
        customer.addRental(rental);
        String correctResult = "<h1>Rentals for <em>" + CUSTOMERNAME + "</em></h1><p>\n";
        correctResult += MOVIETITLE + ": " + 7.5 + "<br>\n";
        correctResult += "</p>You owe <em>" + 7.5 + "</em><p>\n";
        correctResult += "On this rental you earned <em>" + 1 + "</em> frequent renter points</p>";

        assertEquals(correctResult, customer.htmlStatement());
    }

}
