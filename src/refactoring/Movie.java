package refactoring;
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;
    public Movie(String newtitle, int priceCode) {
        title = newtitle;
        setPriceCode(priceCode);
    }
    public int getPriceCode() {
        return price.getPriceCode();
    }
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                this.price = new RegularPrice();
                break;
            case CHILDRENS:
                this.price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }

    }
    public String getTitle (){
        return title;
    };

    double getCharge(int daysRented) {
        return this.price.getCharge(daysRented);
    }

    int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}