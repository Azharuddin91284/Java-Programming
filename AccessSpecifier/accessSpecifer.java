/*
  access specifier ka mtlb hai ki koi variable kaha k accessible rhega in the classes nd methods
  kisi varibl ko aap protect access specifoer use krte jhai to basiclly wh us method or class ke ithin accessible hota outside error show krega
  protecyed specifier mtlb 
 */
package AccessSpecifier;
class AccessSetter{
    public int num1=10;
    public int num2=20;//protected specifier use kr skte hai
    public int num3=30;//protected int num3; mtlb ye access kia ja skta hai like a public specifiers
}
class accessReader extends AccessSetter{
    public void displayAccess(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}

public class accessSpecifer {
    public static void main(String[] args) {
        accessReader sc=new accessReader();
        sc.displayAccess();

    }
    
}
