package ExceptionalHandling;

public class exception__ {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{
            for(int i=0;i<10;i++){// here size 5 hai but 10 element put kr rhe hai so Array index out of bounds exception show kr rh ahai
                arr[i]=i;
            }
        }
        //catch(Exception e) use kr skte hia directly
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("My Exception is : "+e);
        }
        
    }
    
}
