package Abstraction;
import java.util.*;

public class method{
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int [] arr=new int[10];
    System.out.print("Enter the array elements");
    // ueser  input from the user
    for(int i=0; i<10; i++){
        arr[i]=sc.nextInt();
    } 

    // for serching the element from the array
    System.out.println("Enter the element ");
    int x=sc.nextInt();
    for(int i=0; i<10;i++){
        if(arr[i]==x){
            System.out.println("Elemeny is pressent in the array   "+i+" = "+arr[i]);
        }
        else{
            System.out.println("Elemeny is not  pressent in the array");
        }
    }

}   


}
