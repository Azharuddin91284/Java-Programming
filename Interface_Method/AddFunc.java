import java.util.*;
public class AddFunc {
   /* public static int sum1 (int a, int b){// int type fumction returm sum or something
        int sum=a+b;
        return sum;

    }
    */
    public static int mmul(int a, int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values are ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int sum=sum1(a, b);
       // System.out.println("Sum = "+sum);
       int product=mmul(a, b);
       System.out.print("Multiplication of the numbers are = "+product);
        
    }
    
}
