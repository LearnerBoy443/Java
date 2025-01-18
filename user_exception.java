class Userexception extends Exception{
        Userexception(String str){
        super(str);
    }
}
class Main{
    static  void validate(int age )throws Userexception{
        if(age<18){
            throw new Userexception( "Age is not valid");
        }
        else{
            System.out.println("Age is valid");
        }
    }
    public static void main(String args[]){
        try{
            validate(14);
        }
        catch(Userexception e){
            System.out.println("Usereception");
            System.out.println("Exception"+e);
        }
    }
}