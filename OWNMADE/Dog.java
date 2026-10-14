package OWNMADE;

// PILLAR 3: INHERITANCE
public class Dog extends Pet {

    private String behavior;

    public Dog(String name, String breed, int age, String behavior) {
        super(name, breed, age);
        this.behavior = behavior;
    }

    public String getBehavior() {
        return behavior;
    }

    // PILLAR 4: POLYMORPHISM
    @Override
    public void showBehavior() {
        System.out.println(behavior);
    }
}