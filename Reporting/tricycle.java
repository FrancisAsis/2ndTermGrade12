package Reporting;

public class Tricycle extends Vehicle {
    private String toda; // New field specific to tricycle

    public Tricycle(String platenumber,
                     String drivername,
                      String toda) {
        super(platenumber, drivername); // Call the constructor of the superclass (Vehicle)
        this.toda = toda;
    }

    @Override 
    public double calculateFare(double km) { 
        return 20.00 + (km * 10.00);
    }

    public String getToda() {
        return toda;
    }
}