package Reporting.SAMPLES;

public class Classname {
    // 1 Fields Attributes - what the object has. make them private
    private String name;

    // 2 Constructor - runs once when the object is created with new
    public Classname(String name) {
        this.name = name;
    }

    // 3 Getters and Setters - the only doors in the private fields.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 4 Methods - what the object can do
    public void showinfo() {
        System.out.println("Name: " + name);
    }
    
    
    // =======Template======
}
