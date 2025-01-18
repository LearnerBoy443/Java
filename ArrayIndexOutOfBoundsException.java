import java.util.Scanner;
class ArrayIndexOutOfBoundsException{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr [i]=sc.nextInt();
        }
        try{
            System.out.println("Enter the index");
            int index =sc.nextInt();
            System.out.println("Element at index " + index + ": " + arr[index]);
            } 
        catch(Exception e){
            System.out.println(e);
        }
    sc.close();
    }
}