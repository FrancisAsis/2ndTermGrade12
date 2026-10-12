package OWNMADE;
// PILLAR 3: Inheritance

public class main {

    public static void main(String[] args) {

        // Parent-type array
        Pet[] pets = {
            new Dog("Buddy", "Labrador", 3, "Barks and plays"),
            new Cat("Ming", "Persian", 2, "Meows and sleeps"),
            new Dog("Max", "Bulldog", 4, "Runs and wags its tail"),
            new Cat("Luna", "Siamese", 1, "Climbs and plays")
        };

        // Test setter validation
        pets[0].setAge(-1);

        // Display all pets
        for (Pet p : pets) {
            p.showInfo();
            System.out.println("--------------------");
        }
    }
}