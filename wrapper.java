class Wrapper{
    public static void main(String[] args){
        int a =20;
        Integer i=Integer.valueOf(a);
        Integer j=a;
        System.out.println(a+" "+i+" "+j);
        Integer b=new Integer(3);
        int z=b.intValue();
        int x=b;
         System.out.println(b+" "+z+" "+x);
    }
}