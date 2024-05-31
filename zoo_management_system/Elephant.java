package zoo_management_system;

// Elephant class
public class Elephant extends Animal {
    // Overridden makeSound() method for the Elephant
    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }

    // Overridden eat() method for the Elephant
    @Override
    public void eat() {
        System.out.println("Eating grass");
    }
}