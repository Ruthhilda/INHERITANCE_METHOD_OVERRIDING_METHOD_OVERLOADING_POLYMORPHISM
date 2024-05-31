package zoo_management_system;

// Zoo class
public class Zoo {
    public static void main(String[] args) {
        // Demonstrate polymorphism by creating Animal objects of different types
        Animal lion = new Lion();
        lion.makeSound();
        lion.makeSound(4);
        lion.eat();
        lion.eat("meat");

        Animal elephant = new Elephant();
        elephant.makeSound();
        elephant.makeSound(2);
        elephant.eat();
        elephant.eat("grass");

        Animal monkey = new Monkey();
        monkey.makeSound();
        monkey.makeSound(4);
        monkey.eat();
        monkey.eat("bananas");
    }
}