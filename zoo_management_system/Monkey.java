package zoo_management_system;


// Monkey class
public class Monkey extends Animal {
    // Overridden makeSound() method for the Monkey
    @Override
    public void makeSound() {
        System.out.println("Chatter");
    }

    // Overridden eat() method for the Monkey
    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }
}
