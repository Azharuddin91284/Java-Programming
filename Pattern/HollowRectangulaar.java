import java.util.Scanner;

public class HollowRectangulaar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        int m;
        System.out.println("Enter the number row");
        n=sc.nextInt();
        System.out.println("Enter the number of column");
        m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*"+" ");
                }
                else{
                  System.out.print("  ");
                }
               
            }
             System.out.println();
        }

    }
    
}
