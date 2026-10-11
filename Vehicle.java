
public class Vehicle {
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
        return 13.00;
    }

    public void showInfo() {
        System.out.println(platenumber + " | Driver: " + drivername + " | Passengers: " + passangers);
    }

}
