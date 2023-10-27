import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Az{
    int Mul (int a,int b){
    int ans=a*b;
    return ans;
    }

}
public class MethodMul {
    public static void main(String[] args) {
        Az obj=new Az();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();

        System.out.println("Multiplication of the given two numbers are:");
        int ans=obj.Mul(a, b);
        System.out.println(ans);

        
    }
    
}
