import java.util.Scanner;
class ArithmeticExceptionExample{
    public static void main (String args[])
    {    Scanner sc=new Scanner(System.in);
        try{

            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Enter the dividend" + a);
            System.out.println("Enter the Divisor" + b);
            int c=a/b;
            System.out.println("Solution is" + c);
            }
        catch(ArithmeticException e)
            {
            System.out.println(e);
            }
     sc.close();   
    }
}