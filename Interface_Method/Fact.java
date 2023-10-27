import java.util.*;
public class Fact {
    public static void factorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int facto=1;
        for(int i=n;i>=1;i--){
            facto=facto*i;

        }
        System.out.print("Factoerial of the nuber is = "+facto);
        return;// wthout return koi frk nhi pdta hai void ke liye

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your number = ");
        int n=sc.nextInt();
        factorial(n);
        
    }

    
}
