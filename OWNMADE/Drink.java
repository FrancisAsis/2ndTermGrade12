package OWNMADE;

// REQUIREMENT 6: Second subclass
public class Drink extends StoreItem {

    // REQUIREMENT 7: Private field
    private int sizeMl;

    public Drink(String itemName, int stock, double price, int sizeMl) {
        super(itemName,
             stock,
             price); // REQUIREMENT 6
        this.sizeMl = sizeMl;
    }

    // REQUIREMENT 7: Getter
    public int getSizeMl() {
        return sizeMl;
    }

    // REQUIREMENT 8: Different overridden method
    @Override
    public double calculatePrice() {
        return getPrice() + 5.00;
    }
}
