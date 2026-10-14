package OWNMADE;

public class Cat extends Pet {

    private String behavior;

    public Cat(String name, String breed, int age, String behavior) {
        super(name, breed, age);
        this.behavior = behavior;
    }

    public String getBehavior() {
        return behavior;
    }

    @Override
    public void showBehavior() {
        System.out.println(behavior);
    }
}