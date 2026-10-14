package Reporting;

// public class main {
//     public static void main(String[] args) {
//         Vehicle[] fleet = {
//             new Jeepney("NXA 123", "Mang Ramor", "Monumento-Devisorian"),
//             new tricycle("TRC 456", "Kuya Ben", "Badong Silang Toda"),
//             new Bus("BUS 789", "Aling Rose", 8)
            
//         };

//         fleet[0].setPassangers(12);
//         fleet[1].setPassangers(-3);
        

//         for (Vehicle v : fleet) {
//             v.showInfo();
//             System.out.println("Fare for 6 km: " + v.calculateFare(6)); // same line diffirent rsul
//             System.out.println();
//         }
//     }   
// }


public class main {
    public static void main(String[] args) {
    Vehicle[] fleet = {
        new Jeepney("NXA 123", "Mang Ramor", "Monumento-Devisorian"),
        new tricycle("TRC 456", "Kuya Ben", "Badong Silang Toda"),
        new Bus("BUS 789", "Aling Rose", 8)
        
    };

    try   {
        for (int i = 0; i < fleet.length; i++) {
            fleet[i].showInfo();
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Problem: " + e.getMessage());
    }
    System.out.println("End of fleet report.");
    
   }

}