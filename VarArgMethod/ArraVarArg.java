// Var args method crete krne ki jrurat pdi ki ek method se multiple argument(1 lakhs ,1k etc) pass kia ja ske or baar baar code note krne ki jrurat nhi pdti hai 
package VarArgMethod;

public class ArraVarArg {
    public static void main(String[] args) {
        int [] x={1,2,3,4,5,6,7,8};// first execute this one then after it will go to the next array variable
        int [] y={3,5,6,7,9};// second execute this one then after it will go to the next array variable
        m1(x, y);
    }
    public static void m1(int []... x){
        for(int [] x1:x){
            System.out.println(x1[3]);
            System.out.println(x1[4]);
            System.out.println(x1[0]);
            System.out.println(x1);


        }
    }
    
}