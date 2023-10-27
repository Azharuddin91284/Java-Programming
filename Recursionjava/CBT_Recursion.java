package Recursionjava;

public class CBT_Recursion {
    public static int count_bit(int n){
        if(n==0){
            return 0;
        }
        else{
            return(n&1)+count_bit(n>>1);
        }
    }
    public static void main(String[] args) {
        int n=15;
        System.out.println("Number of one bit = "+count_bit(n));
    }
    
}
