// Abstraction: Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound(); // This method must be implemented by subclasses

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Inheritance: Dog class inherits from Animal
class Dog extends Animal {
    // Method overriding
    void sound() {
        System.out.println("Dog barks");
    }
}

// Inheritance: Cat class inherits from Animal
class Cat extends Animal {
    // Method overriding
    void sound() {
        System.out.println("Cat meows");
    }
}

// Encapsulation: Person class
class Person {
    // Private variables
    private String name;
    private int age;

    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

// Main class to demonstrate OOP principles
public class Main {
    public static void main(String[] args) {
        // Demonstrating Encapsulation
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying the age
        person.setAge(31);
        System.out.println("Updated Age: " + person.getAge());

        // Demonstrating Abstraction and Polymorphism
        Animal myDog = new Dog(); // Animal reference but Dog object
        Animal myCat = new Cat(); // Animal reference but Cat object

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows

        // Demonstrating Inheritance
        myDog.eat(); // Output: This animal eats food.
        myCat.eat(); // Output: This animal eats food.
    }
}