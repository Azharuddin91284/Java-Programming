/*Method need to call using Object( call by reference value)
 * and Function call by name itself without using any reference(object) */

import java.util.Scanner;

class Azhar{
    int add(int a,int b){
    int ans=a+b;
    return ans;
    }

}
public class Method {
    public static void main(String[] args) {
        Azhar obj =new Azhar();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a=sc.nextInt();
        System.out.println("Enter the second value: ");
        int b=sc.nextInt();

        System.out.println("Sum of the given nubers are: ");
        int ans=obj.add(a, b);
        System.out.println(ans);

        
    }
    
}
