package OWNMADE;
// PILLAR 2: ABSTRACTION
public abstract class Pet {

    // PILLAR 1: ENCAPSULATION
    private String name;
    private String breed;
    private int age;

    // Constructor
    public Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    // Setter with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Abstract method
    public abstract void showBehavior();

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years");
        System.out.print("Behavior: ");
        showBehavior();
    }
}