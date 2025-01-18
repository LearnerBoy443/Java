class OuterClass {
    private int outerValue = 10;

    // Inner class (Non-static inner class)
    class InnerClass {
        void display() {
            System.out.println("Outer value: " + outerValue); // Accessing private field of outer class
        }
    }

    void createInnerInstance() {
        InnerClass inner = new InnerClass(); // Creating an instance of inner class
        inner.display();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(); // Outer class instance
        outer.createInnerInstance();  // Accessing inner class functionality
    }
}