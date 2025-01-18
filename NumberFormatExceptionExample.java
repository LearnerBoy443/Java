class NumberFormatExceptionExample{
    public static void main(String args[])
    {
        String str ="abc";
        try{
            int a = Integer.parseInt(str);
            System.out.println(str);
        }   
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}