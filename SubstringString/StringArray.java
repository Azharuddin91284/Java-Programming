import java.util.*;
import java.util.Scanner;
public class StringArray{
    public static void main(String args[]){
        //int [] marks=new int [5] is also okay for initialisation
        //Type [] array_name=new type[size]; first way to represent array
         int marks[]=new int [5];
        marks[0]=98;
        marks[1]=95;
        marks[2]=96;
        marks[3]=94;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println("Size of the array is = "+ marks.length);// arrayname.length=size of the array
         System.out.println();


        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }

        // 2nd method for array initialisation
        //type[] arrayname={value};
        int marks_[]={98,95,96,94};

        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }

        //User input to make array
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int size=sc.nextInt();

       String numbers[]=new String[size];//null value 0  
      // float numbers[]=new float[size];//null value 0.0 
      //boolean numbers[]=new boolean[size];//by default null value False 
     // char numbers[]=new char[size];//null value " " space for character only
     //String numbers[]=new String[size];//null value  null


     // for loop for input
     for(int i=0;i<size;i++){
            numbers[i]=sc.next();
        }
        System.out.println();
         System.out.println();

      // for loop for output
        for(int i=0;i<size;i++){
            System.out.println((i+1) +" Name is " + numbers[i]);
        }


    }
}