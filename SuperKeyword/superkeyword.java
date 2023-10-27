// super keyword is going to invoke the first class which parent clas or costructor variables directly in the case of inheritance or constructor.
package SuperKeyword;
class a1{//super keyword is used here
    int i=20;

}
class a2 extends a1{// super keyword is not using here
    int i=40;
   void print(){
    System.out.println("Before super : "+i+"  After super : "+super.i);
   }
}

public class superkeyword {
    public static void main(String[] args) {
        a2 sc=new a2();
        sc.print();
    }
    
}
