package BitManipulation;
import java.util.*;

import java.util.Scanner;

public class BitCounting {
   static int count_bit(int n){
    int count=0;
    while(n>0){
      count +=n&1;
      n >>= 1;
    }
    return count;

          
        }
    public static void main(String[] args) {
      int n=15;
       
       /*  System.out.println("Enter the value");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int count=0;
        while(n>0){
          count +=n&1;
          n=n>>1;

          }
          */
        System.out.print("Number of one bits = "+count_bit(n));
    }
    
}
