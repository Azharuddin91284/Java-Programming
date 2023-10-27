   import java.util.Scanner;
public class Diamondshap {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value ");
        n=sc.nextInt();
    /*    for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
         for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
    }
    */
     for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
         for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
    }
    
}
}


