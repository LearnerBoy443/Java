import java.util.Scanner;
class palindrome{
    public static void main(String args[]){
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in); 
    int r,sum=0,temp;
    int n=sc.nextInt();
    temp=n;
    while(n>0){        
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    if(temp==sum){
        System.out.print(temp+"is a palindrome number");
    }
    else{
        System.out.println(temp+"is not a palindrome number");
    } 
    sc.close();
}
}