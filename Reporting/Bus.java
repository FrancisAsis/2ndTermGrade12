package Reporting;

public class Bus extends Vehicle {

    private int seats;    

    public Bus (String platenumber,
                     String drivername,
                      int seats) {
        super(platenumber, drivername); // Call the constructor of the superclass (Vehicle)
        this.seats = seats; 
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public double calculateFare(double km) { // Override the calculateFare method for Bus
        return 18.00 + (km *  2.00);
    }

    public static void main(String[] args) {
        Bus b = new Bus("BUS 789", "Aling Rose", 8);
        b.setPassengers(30);
        b.showInfo();
        System.out.println("Fare for 6 km: " + b.calculateFare(6));
        System.out.println("Seats: " + b.getSeats());
    }

}