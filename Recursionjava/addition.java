package Recursionjava;
public class addition {
    public static void main(String[] args) {
        int result=add(1,10);
        System.out.println("Addition of the numbers is = "+result);
        System.out.println("************");
        int result_=sum(10);
        System.out.println("Additon is = "+result_);

        
    }
     public static int add(int start, int end){
        if(end>start){// base condition for recursion
            return end + add(start, end-1);
        }
        else{
            return start;//halting condition
        }
    
    }

    public static int sum(int x){
        if(x>0){// base coondition for recursion
            return x + sum(x-1);
        }else{
            return 0;//halting condition
        }
    }
    
}
