package Exception;

import Reporting.Bus;
import Reporting.Jeepney;
import Reporting.Vehicle;
import Reporting.tricycle;

public class main {
    public static void main(String[] args) {
    Vehicle[] fleet = {
        new Jeepney("NXA 123", "Mang Ramor", "Monumento-Devisorian");
        new tricycle("TRC 456", "Kuya Ben", "Badong Silang Toda");
        new Bus("BUS 789", "Aling Rose", 8);
        
    };

    for (int 1 = 0; i <= fleet.length; 1++) {
        fleet[i].showInfo();
    }
    System.out.println("End of fleet report.");
    
    }
    
}
