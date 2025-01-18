class OuterClass {
    private static int staticValue = 100;
    private int instanceValue = 10;

    // Static nested class
    static class NestedClass {
        void display() {
            System.out.println("Static value: " + staticValue); // Accessing static field of outer class
        }
    }

    void createNestedInstance() {
        NestedClass nested = new NestedClass(); // Creating an instance of static nested class
        nested.display();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass nested = new OuterClass.NestedClass(); // Directly creating static nested class
        nested.display();
    }
}
