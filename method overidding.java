// Superclass (Parent class)
class Animal {
    // Method in superclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass (Child class)
class Dog extends Animal {
    // Overriding the method from the superclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass (Child class)
class Cat extends Animal {
    // Overriding the method from the superclass
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test method overriding
public class Main {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the overridden methods
        myDog.sound();  // Output: Dog barks
        myCat.sound();  // Output: Cat meows
    }
}
