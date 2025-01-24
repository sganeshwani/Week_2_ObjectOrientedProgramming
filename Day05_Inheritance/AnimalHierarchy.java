// Superclass representing a general Animal
class Animal {
    String name; // Name of the animal
    int age; // Age of the animal

    // Constructor to initialize name and age of the animal
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to simulate the sound an animal makes
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass of Animal representing a Dog
class Dog extends Animal {
    // Constructor to initialize name and age of the dog, using the superclass constructor
    Dog(String name, int age) {
        super(name, age);
    }

    // Overriding the makeSound method to specify the sound a dog makes
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass of Animal representing a Cat
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Subclass of Animal representing a Bird
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println("Bird tweets");
    }
}

// Main class to test the functionality of the program
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating an object of the superclass Animal
        Animal animal1 = new Animal("Generic Animal", 0);

        // Creating objects of subclasses Dog, Cat, and Bird
        Dog dog1 = new Dog("Max", 3);
        Cat cat1 = new Cat("Tom", 2);
        Bird bird1 = new Bird("Tweety", 1);

        // Calling the makeSound method for each object
        animal1.makeSound();
        dog1.makeSound();
        cat1.makeSound();
        bird1.makeSound();
    }
}
