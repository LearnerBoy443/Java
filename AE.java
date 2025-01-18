import java.util.Scanner;

class ArithmeticExceptionExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter the dividend:"); // Prompt user before input
            int a = sc.nextInt();
            
            System.out.println("Enter the divisor:"); // Prompt user before input
            int b = sc.nextInt();
            
            int c = a / b;  // Perform division
            
            System.out.println("Solution is: " + c);  // Print the result
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());  // Handle divide by zero
        }
        
        sc.close();  // Close the scanner
    }
}
