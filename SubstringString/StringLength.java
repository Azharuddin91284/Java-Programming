// question  Take an array of String input from the user & find the cumulative (Combined) length of all those String

import java.util.*;
import java.util.Scanner;
public class StringLength {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
            // next() means one word for string or character
           // nextLine() means collection of words or Sentences
        
        System.out.print("Enter the size = ");
        int size=sc.nextInt();
        //String s=sc.nextLine();

       String array[]=new String[size];
       int totalLength=0;
        for(int i=0;i<size;i++){
          array[i]=sc.next();
          totalLength += array[i].length();

            
        }
        System.out.print("The length of the String is = " +totalLength);


        
    }
    
}
