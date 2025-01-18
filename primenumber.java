class primenumber{
    static void prime(int n){
        int i, m=0,Flag=0;
        int m=n/2;
        if (n==0||n==1){
            System.out.println(n+"is not a prime number");
        }
        else{
            for(i=2;i<m;i++){
                if(n%i==0){
                    System.out.println(n+"is not a prime number");
                    Flag=1;                
                }
                break;
            }
        }
        if(flag==0){
            System.out.println(n+"is a prime number");
        }
    }
    public static void main(String args[]){
        prime(34);
        prime(35);
        prime(500);
    }
}