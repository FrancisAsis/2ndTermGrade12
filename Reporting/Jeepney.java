package Reporting;

public class Jeepney extends Vehicle {
    private String route; // New field specific to Jeepney

    public Jeepney(String platenumber,
                     String drivername,
                      String route) {
        super(platenumber, drivername); // Call the constructor of the superclass (Vehicle)
        this.route = route;
    }

    @Override 
    public double calculateFare(double km) { // Override the calculateFare method for Jeepney
        double extra = Math.max(0, km - 4)  * 2.00;
        return 13.00 + extra;
    }

    public String getRoute() {
        return route;
    }

    public static void main(String[] args) {

    Jeepney j = new Jeepney("NXA 123", "Mang Ramor", "Monumento-Devisorian");
    j.setPassengers(12);
    j.showInfo();

    System.out.println("Route: " + j.getRoute()); 

    }
}