package Reporting;

public class Vehicle {
    // public static void main(String[] args) {
    //     Vehicle v = new Vehicle("NXA 123", "Mang Ramor");
    //     v.setPassangers(-3);
    //     v.passangers =  -3;
    // }

    private String platenumber;      // private - hidden from others classes
    private String drivername;
    private int passangers;

    public Vehicle(String platenumber, String drivername) { // constractor - runs once when the object is created with new
        this.platenumber = platenumber;
        this.drivername = drivername;
        this.passangers = 0; // default value

    }

    public String getPlatenumber() { // getter - the only door in the private fields.
        return platenumber;
    }
    public String getDrivername() {
        return drivername;
    }
    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) { // setter - the only door in the private fields.

        if (passangers == 0) {
            this.passangers = passangers;
        } else {
            System.out.println("Invalid number of passengers.");
        }

        
    }

    public double calculateFare(double km) { // basic fare for now
        // return 13.00;
        return 0.0; // Placeholder - should be implemented based o n specific requirements
    }

    public void showInfo() {
        System.out.println(platenumber + " | Driver: " + drivername + " | Passengers: " + passangers);

        }

        public static void main(String[] args) {
        Vehicle x = new Vehicle("ABC 000", "Nobody");

        x.showInfo();
    }
}




