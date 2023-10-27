import java.util.*;
import java.util.Scanner;
public class SubstrigStri{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
            // next() means one word for string or character
           // nextLine() means collection of words or Sentences
        String x=sc.nextLine();
        System.out.println("String name "+x);
        String x1=sc.next();
        System.out.println("word name "+x1);
        String a=".org";
        String b=".com";
        String c=".in";
        

        // concatenation of string
        String full=a+" "+b;
        System.out.println(full);


        // finding length of the string
        System.out.println(a.length());

       // for compare of string uses .compareTo() function with cases 
        //case 1: s1>s2= +ve value
        //case 2: s1==s2 =0
        // case 3: s1<s2 = -ve value
        if(x.compareTo(a) ==0){
            System.out.println(a.length()+" Organisational ");
        }else if(x.compareTo(b) ==0){
            System.out.println(b.length()+" Commercial ");
        }else if(x.compareTo(c) ==0){
            System.out.println(c.length()+" Internal ");
        }
        else{
            System.out.println("Anything");
        }
        System.out.println();
        System.out.println();
        


        // new way to create new  string
        // == to always not give true result so used .compareTo function for comparison
        if(new String("azhar") == new String("azhar")){
            System.out.println("String are equal");
        }
        else{
            System.out.println("Not equal");
        }
        System.out.println();

        // using compare to function
        String d="azhar";
        if(new String("azhar").compareTo(d) ==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Not equal");
        }


        // Sustring concept
        
        String a_="My name is Azhar";
        //sustring(beg index, end index)
        String name=a_.substring(11, a_.length());
        System.out.println(name);// Azhar output

        System.out.println();
        String az="Azharuddin";
        //sustring(beg index, end index)
        String name_=az.substring(0, 5);
        System.out.println(name_);// Azhar output
         String name_1=az.substring(4);
         System.out.println(name_1);//ruddin

         // Strings are immutable which canot be changed

        // for string comparison we can also use .equal() function not using == like this it is only gives correct answer for Integer.
        String s1="Azhar";
        String s2="Azhar1";
        if(s1.equals(s2)){
            System.out.println("YEs both are equal");
        }
        else{
            System.out.println("no both are not equal");
        }
        
        
    }
}