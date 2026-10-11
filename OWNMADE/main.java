package OWNMADE;

public class main {

    public static void main(String[] args) {

        // REQUIREMENT 9: Parent-type array
        StoreItem[] items = {
            new Snack("Piattos", 20, 20.00, "Cheese"),
            new Snack("Chippy", 15, 10.00, "Spicy"),
            new Drink("Coca-Cola", 12, 18.00, 250),
            new Drink("Water", 30, 10.00, 500)
        };

        // Test setter validation
        items[0].setStock(25);
        items[1].setStock(-5);

        // REQUIREMENT 9: Loop through the array
        for (StoreItem item : items) {
            item.showInfo();

            // Show subclass-specific information
            if (item instanceof Snack) {
                Snack snack = (Snack) item;
                System.out.println("Flavor: " + snack.getFlavor());
            } else if (item instanceof Drink) {
                Drink drink = (Drink) item;
                System.out.println("Size: " + drink.getSizeMl() + " ml");
            }

            System.out.println("--------------------");
        }
    }
}
