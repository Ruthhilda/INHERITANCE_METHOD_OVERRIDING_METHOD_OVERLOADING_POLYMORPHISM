package zoo_management_system;

// Animal class
public class Animal {
    // Fields to store the name and age of the animal
    protected String name;
    protected int age;

    // Method to make a generic animal sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    // Overloaded method to make the animal sound multiple times
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("The animal makes a sound.");
        }
    }

    // Method for the animal to eat
    public void eat() {
        System.out.println("The animal is eating.");
    }

    // Overloaded method for the animal to eat a specific food type
    public void eat(String foodType) {
        System.out.println("The animal is eating " + foodType + ".");
    }
}
