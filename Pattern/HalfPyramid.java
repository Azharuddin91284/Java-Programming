import java.util.Scanner;
public class HalfPyramid {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
           
            System.out.println();
        }
        // x y axis Pyramid 
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
           
            System.out.println();
        }

    }
    
}
