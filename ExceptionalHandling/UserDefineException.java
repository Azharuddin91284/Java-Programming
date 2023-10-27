package ExceptionalHandling;
class num2 extends Exception{
    num2(int w){
        System.out.println(w+"\t is an illigle exception");
    }
}

public class UserDefineException {
    public static void trial(int l) throws num2{
    if(l==5){
        throw new num2(l);
    }

}
    public static void counter(int i){
        try{
            for(int k=1;k<10;k++){
                System.out.println(k);
                trial(k);
            }

        }
        catch(num2 e){
            System.out.println("\t Exception caught: " + e);
        }
    }
    public static void main(String[] args) {
        counter(1);
        
    }
    
}
