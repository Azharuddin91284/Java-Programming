//Recursion and loop or iteration both are like a brother jo kaam iteration means loop se kr skte wh sbhi kaam Recursion se bhi kr skte hai jaha jo easy lgta hai according to problem use kia jata hai
package Recursionjava;

public class recursiion {
    /*public static void printnum(int n) {
        if(n==0){// base condition till base condition is true it will execute easily when break then Return
            return;
        }
        System.out.print(n+" ");
        printnum(n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        printnum(n);//5 4 3 2 1
        
    }*/
    public static void printnum(int n){
        if(n==5){
            return;
        }
        System.out.print(n+" ");
        printnum(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printnum(n);

    }
    
}
