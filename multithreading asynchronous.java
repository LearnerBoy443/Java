import java.util.Scanner;
class Thread1 extends Thread{
    Scanner sc;
    Thread1(Scanner sc)
    {
        this.sc=sc;
    }
    @Override
    public void run(){
        String name1= sc.nextLine();
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread1"+name1+":"+i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Thread2 extends Thread{
    Scanner sc;
    Thread2(Scanner sc)
    {
        this.sc=sc;
    }
    @Override
    public void run(){
        String name2= sc.nextLine();
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread2"+name2+":"+i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       Thread1 t1 = new Thread1(sc);
       Thread2 t2 = new Thread2(sc);
       t1.start();
       t2.start();
       sc.close();
    }
}