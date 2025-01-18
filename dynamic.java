class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal; // Declare an Animal reference

        myAnimal = new Dog(); // Animal reference but Dog object
        myAnimal.sound(); // Calls Dog's sound()

        myAnimal = new Cat(); // Animal reference but Cat object
        myAnimal.sound(); // Calls Cat's sound()
    }
}