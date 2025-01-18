class armstrong{
    public static void main(String args[]){
        int n=90,sum=0,temp,digit=0,last;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
        if (sum==n){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}