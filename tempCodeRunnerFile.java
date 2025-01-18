import java.util.Scanner;
class palindrome{
    public static void main(String args[])
    Scanner sc = new Scanner(System.in) 
    int r,sum,temp;
    int n=sc.nextInt();
    temp=n;
    while(n>0){        
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    if(temp==sum){
        System.out.print(n+"is a prime number");
    }
    else{
        System.out.println(n+"is not a prime number");
    } 
    sc.close();
}