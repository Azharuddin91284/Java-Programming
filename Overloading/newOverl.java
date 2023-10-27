// method oveloading means same class me ydi ek method se 2 parameter pass kr rhe hai but mujhe need hai ki baad me three or four parameter pass krna so 'overloading concept use krte hai' same method name rhega and same class me but three parameter pass kr denge or main mehtod me use call kr denge that's it.

package Overloading;
class azhar{
    void sum(int a, int b){
        System.out.println("The sum of two numbers are = "+(a+b));
    }
      void sum(int a, int b,int c){
        System.out.println("The sum of three numbers are = "+(a+b+c));
    }
}

public class newOverl {
    public static void main(String[] args) {
        azhar a=new azhar();
        a.sum(2,4,6);
        a.sum(2,4);
    }
    
}
