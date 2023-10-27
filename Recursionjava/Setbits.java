package Recursionjava;

import java.util.Scanner;

public class Setbits {
    static int setbits(int n){
         int count=0;
        while(n>0){
            n=n&(n-1);
            count++;

        }return count;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n=sc.nextInt();
        System.out.println("Setbites are "+setbits(n));

       
    
}
}
