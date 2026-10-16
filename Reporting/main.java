package Reporting;

// public class Main { Main
//     public static void main(String[] args) {
//         Vehicle[] fleet = {
//             new Jeepney("NXA 123", "Mang Ramor", "Monumento-Devisorian"),
//             new Tricycle("TRC 456", "Kuya Ben", "Badong Silang Toda"),
//             new Bus("BUS 789", "Aling Rose", 50)
//         };

//         fleet[0].setPassengers(12);
//         fleet[1].setPassengers(-3);
        

//         for (Vehicle v : fleet) {
//             v.showInfo();
//             System.out.println("Fare for 6 km: " + v.calculateFare(6)); // same line diffirent rsul
//             System.out.println();
//         }
//     }   
// }

// public class Main { Exception
//     public static void main(String[] args) {
//         Vehicle[] fleet = {
//             new Jeepney("NXA 123", "Mang Ramor", "Monumento-Devisorian"),
//             new Tricycle("TRC 456", "Kuya Ben", "Badong Silang Toda"),
//             new Bus("BUS 789", "Aling Rose", 50)
//         };
        
//         try {
//             for (int i = 0; i <  fleet.length; i++) { fixed
//                 fleet[i].showInfo();
//             }
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Problem: " + e.getMessage());
//         }
//         System.out.println("End of fleet report.");
//     }   
// }

// public class Main {
//     public static void main(String[] args) {
//         Tricycle trike = new Tricycle("TRC 456", "Kuya Ben", "Badong Silang Toda");
//         int collected = 100;    //pesos collected today
//         int rider = trike.getPassengers(); //still 0

//         try {
//             int sharePerRider = collected / rider; 
//             System.out.println("Share per rider: " + sharePerRider); //skipped
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot split the fare: " + e.getMessage());
//         }
//         System.out.println("Report done.");
//     }   
// }

// public class Main {
//     public static void main(String[] args) {
//         Vehicle[] fleet = new Vehicle[3];
//             fleet[0] = new Jeepney("NXA 123", "Mang Ramor", "Monumento-Devisorian");

//             try {
//                 fleet[0].showInfo();
//             } catch (NullPointerException e) {
//                 System.out.println("Problem: " + e.getMessage());
//             }

//             String typed = "twelve"; // user input
//             try {
//                 int passengers = Integer.parseInt(typed);
//                 fleet[0].setPassengers(passengers);
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid number of passengers: " + e.getMessage());
//             }
//             System.out.println("Done.");
//     }   
// }

// import java.io.File;
// import java.io.FileNotFoundException; //new
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         try {
//             Scanner file = new Scanner (new File("drivers.txt"));
//             while (file.hasNextLine()) {
//                 System.out.println("Driver: " + file.nextLine());
//             }
//             file.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("File not found: " + e.getMessage());
//         }
//         System.out.println("Driver list Finished.");
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Jeepney jeep = new Jeepney("NXA 123", "Mang Ramon", "Monumento-Divisoria");

//         try {
//             System.out.print("Distance in km: ");
//             double km = Double.parseDouble(sc.nextLine());
//             System.out.print("Riders sharing the fare: ");
//             int riders = Integer.parseInt(sc.nextLine());

//             // int fare = (int) jeep.computeFare(km);
//             // System.out.println("Total fare: P" + fare + ", each pays: P" + (fare / riders));
//         } catch (NumberFormatException e) {
//             System.out.println("Please type numbers only.");
//         } catch (ArithmeticException e) {
//             System.out.println("Riders cannot be zero.");
//         } finally {
//             System.out.println("Thank you for riding!");
//         }
//     }
// }

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    // throws: "I might fail with this. Whoever calls me must handle it."
    public static void printDrivers(String fileName) throws FileNotFoundException {
        Scanner file = new Scanner(new File(fileName));
        while (file.hasNextLine()) {
            System.out.println("Driver: " + file.nextLine());
        }
        file.close();
    }

    public static void main(String[] args) {
        Jeepney jeep = new Jeepney("NXA 123", "Mang Ramon", "Monumento-Divisoria");

        try {
            jeep.setPassengers(-3); // the setter THROWS now
            jeep.showInfo(); // skipped
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        try {
            printDrivers("drivers.txt"); // the caller handles it
        } catch (FileNotFoundException e) {
            System.out.println("Missing file: " + e.getMessage());
        }
    }
}