package OWNMADE;

// REQUIREMENT 1: Abstract na may perent class
public abstract class StoreItem {

    // REQUIREMENT 2: 3 private fields 
    private String itemName;
    private int stock;
    private double price;

    // REQUIREMENT 3: Constructor with this
    public StoreItem(String itemName, int stock, double price) {
        this.itemName = itemName;
        this.stock = stock;
        this.price = price;
    }

    // REQUIREMENT 4: Getter for every field
    public String getItemName() {
        return itemName;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    // REQUIREMENT 5: Setter with validation na nag rereturn ng error message kapag mali ang input
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Invalid stock!");
        }
    }

    // REQUIREMENT 1: Abstract method
    public abstract double calculatePrice();

    public void showInfo() {
        System.out.println("Item: " + itemName);
        System.out.println("Stock: " + stock);
        System.out.printf("Price: PHP %.2f%n", calculatePrice());
    }
}
