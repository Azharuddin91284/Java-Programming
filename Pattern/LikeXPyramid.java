/*Half butter fly and Full butterfly pattern in case of counting that's the power of Azharuddin Ansari bhai */

import java.util.Scanner;
public class LikeXPyramid {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value ");
        n=sc.nextInt();
        // half upper butterfly
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
           
           
            System.out.println();
        }
        // half lower  butter  fly
        System.out.println("***********************************************************************");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
           
           
            System.out.println();
        }
        System.out.println("**********************************************************************************");
        // full buttrt fly
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
           
           
            System.out.println();
        }
          for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
           
           
            System.out.println();
        }
        System.out.println("******************************************************************");
// full butter fly
       for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
           
           
            System.out.println();
        }
          for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
           
           
            System.out.println();
        }
        System.out.println("****************************************************");
        // using pattern full butter fly

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
           
           
            System.out.println();
        }
          for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
           
           
            System.out.println();
        }
        System.out.println("****************************************************");
        // Ful buter fly usoing pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
           
           
            System.out.println();
        }
          for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
           
           
            System.out.println();
        }
        System.out.println("**********************");
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
           
           
            System.out.println();
        }
          for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
           
           
            System.out.println();
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
           
           
            System.out.println();
        }
          for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
           
           
            System.out.println();
        }

    }
    
}



    

