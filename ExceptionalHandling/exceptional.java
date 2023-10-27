package ExceptionalHandling;

public class exceptional {
    public static void main(String[] args) {
        int a=10;

        try{
            int b=100;
            int c=100/0;
            System.out.println(a);
            System.out.println(c);
        }
        catch(Exception e){//Arithmetic exception devide by zero that's it
            System.out.println("My exception is : "+e.getMessage());
        }
    }
    
}
