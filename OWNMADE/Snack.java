package OWNMADE;

// REQUIREMENT 6: First subclass
public class Snack extends StoreItem {

    // REQUIREMENT 7: Private field
    private String flavor;

    public Snack(String itemName,
          int stock,
          double price, 
          String flavor) {
        super(itemName, stock, price); // REQUIREMENT 6
        this.flavor = flavor;
    }

    // REQUIREMENT 7: Getter
    public String getFlavor() {
        return flavor;
    }

    // REQUIREMENT 8: Override abstract method
    @Override
    public double calculatePrice() {
        return getPrice() + 2.00;
    }
}
