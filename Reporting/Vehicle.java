package Reporting;

public class Vehicle {
    // public static void main(String[] args) {
    //     Vehicle v = new Vehicle("NXA 123", "Mang Ramor");
    //     v.setPassengers(-3);
    //     v.passangers =  -3;
    // }

    private String platenumber;      // private - hidden from others classes
    private String drivername;
    private int passengers;

    public Vehicle(String platenumber, String drivername) { // constractor - runs once when the object is created with new
        this.platenumber = platenumber;
        this.drivername = drivername;
        this.passengers = 0; // default value

    }

    public String getPlatenumber() { // getter - the only door in the private fields.
        return platenumber;
    }
    public String getDrivername() {
        return drivername;
    }
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) { // setter - the only door in the private fields.

        // if (passengers == 0) {
        //     this.passengers = passengers;
        // } else {
        //     System.out.println("Invalid number of passengers.");
        // }

        if (passengers < 0) {
        throw new IllegalArgumentException(
            "Passengers cannot be negative: " + passengers);
        }
        this.passengers = passengers;
        
    }
    

    // ADDED: Bagong method para sa pag-board ng pasahero na may OverloadException
    public void board(int count) throws OverloadException {
        if (getPassengers() + count > getCapacity()) {
            throw new OverloadException(getPlatenumber() + " is full! Capacity "
                + getCapacity() + ", but " + (getPassengers() + count) + " tried to ride.");
        }
        setPassengers(getPassengers() + count);
    }

    // ADDED: Bagong method para sa quoteFare na may InvalidDistanceException
    public double quoteFare(double km) {
        if (km <= 0) {
            throw new InvalidDistanceException("Distance must be more than 0 km, got " + km);
        }
        return calculateFare(km); // polymorphism: each vehicle's own formula
    }
    

    public double calculateFare(double km) { // basic fare for now
        // return 13.00;
        return 0.0; // Placeholder - should be implemented based o n specific requirements
    }

    public void showInfo() {
        System.out.println(platenumber + " | Driver: " + drivername + " | Passengers: " + passengers);

        }

        public static void main(String[] args) {
        Vehicle x = new Vehicle("ABC 000", "Nobody");

        x.showInfo();
    }
}








// package Reporting;

// public class Main {
//     public static void main(String[] args) {
//         Jeepney jeep = new Jeepney("NXA 123", "Mang Ramon", "Monumento-Divisoria");
//         Tricycle trike = new Tricycle("TRC 456", "Kuya Ben", "Bagong Silang TODA");
        
//         try {
//             jeep.board(15);
//             jeep.showInfo();
//             jeep.board(10);
//             // 15 + 10 = 25, more than 20
//             jeep.showInfo();
//             // skipped
//         } catch (OverloadException e) {
//             System.out.println("Cannot board: " + e.getMessage());
//         }
        
//         try {
//             System.out.println("Fare: P" + trike.quoteFare(-2));
//         } catch (InvalidDistanceException e) {
//             System.out.println("Cannot quote: " + e.getMessage());
//         } finally {
//             System.out.println("Trip log saved.");
//         }
//     }
// }