package VarArgMethod;

public class varArg {
    public static void m1(int ... x){
        System.out.println("How are you");
    }
    public static void m1(int x){
        System.out.println("shyam babu");
    }
    public static void main(String[] args) {
        m1();
        m1(10,50);
        m1(10,8,9);
        m1(10);// shyam babu how are you
        
    }
    
}
