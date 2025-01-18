class NullPointerExceptionExample{
    public static void main (String args[])
    {
        String str = null;
        try{
            int a = str.length();
            System.out.println(a);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}