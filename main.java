import java.util.Scanner;

class Thread1 extends Thread {
    private String name1;  // Store the name for thread1

    // Constructor to receive the name from the main thread
    Thread1(String name1) {
        this.name1 = name1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread1: " + name1 + ":" + i);
        }
        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread {
    private String name2;  // Store the name for thread2

    // Constructor to receive the name from the main thread
    Thread2(String name2) {
        this.name2 = name2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread2: " + name2 + ":" + i);
        }
        try {
            Thread.sleep(1000);  // Sleep for 1 second
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create the Scanner object

        // Get input from the user before starting the threads
        System.out.print("Enter name for Thread1: ");
        String name1 = sc.nextLine();

        System.out.print("Enter name for Thread2: ");
        String name2 = sc.nextLine();

        // Create thread objects and pass the names to the constructor
        Thread1 t1 = new Thread1(name1);
        Thread2 t2 = new Thread2(name2);

        // Start the threads
        t1.start();
        t2.start();

        // Close the Scanner after starting the threads
        try {
            t1.join();  // Wait for Thread1 to finish
            t2.join();  // Wait for Thread2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        sc.close();  // Close the Scanner after both threads have finished
    }
}
