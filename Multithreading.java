class Oddthread extends Thread{
    @Override
    public void run()
    {
        for(int i=0; i<=20;i++)
        {
            if(i%2!=0){
                System.out.println(i);
            }
        }    
    }
}
class Eventhread extends Thread{
    @Override
    public void run()
    {
        for(int a =0;a<=20;a++)
        {
            if(a%2!=0){
                System.out.println(a);
            }
        }
    }    
}
public class Multithreading{
    public static void main(String[] args){
    Oddthread odd = new Oddthread();
    Eventhread even= new Eventhread();
    odd.setPriority(Thread.MAX_PRIORITY);
    even.setPriority(Thread.MIN_PRIORITY);
    odd.start();
    even.start();
    }
}