class Main_Thread extends Thread {
    int a, b;

    Main_Thread(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        // Base run method can be empty or have some logic if needed in base class
    }
}

class OddThread extends Main_Thread {
    OddThread(int a, int b) {
        super(a, b);
    }

    @Override
    public void run() {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);  // Print odd numbers
            }
        }
    }
}

class EvenThread extends Main_Thread {
    EvenThread(int a, int b) {
        super(a, b);
    }

    @Override
    public void run() {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);  // Print even numbers
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OddThread ob2 = new OddThread(20, 30);   // Odd thread from 20 to 30
        EvenThread ob3 = new EvenThread(50, 60); // Even thread from 50 to 60

        // Setting priorities for the threads
        ob2.setPriority(4);
        ob3.setPriority(5);

        // Starting the threads
        ob2.start();
        ob3.start();
    }
}
