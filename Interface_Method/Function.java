import java.util.*;
public class Function {
    /*Declarration of method 
         returnTupe functionName(type arg1, typearg2...)
         returnType of function is void so it will not return anything
         */

    // print name in function

    public static void myname(String name){
        System.out.println(name);
        return ;// if return type int hota to return 1 use krte
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String name=sc.nextLine();
        myname(name);

        
         
        
    }
    
}
