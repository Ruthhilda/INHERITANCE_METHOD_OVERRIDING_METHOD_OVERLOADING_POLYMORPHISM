package zoo_management_system;

// Lion class
public class Lion extends Animal {
    // Overridden makeSound() method for the Lion
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    // Overridden eat() method for the Lion
    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}