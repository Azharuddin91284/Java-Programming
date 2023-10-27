// abstract class is a restricted class that cannot be used to create object(but it can inherited by other class )
//Abstract method can only be used in the abstract class and it does not have a body.
//the body is provided by the subclass(inherited from) then call the abstract bmethod using object creation
package Abstractclass;
abstract class az{//abstract class wi;ll be created using abstract name class name
    public String fname="Azharuddin Bhai";
    public int age=21;
    public abstract void study();//abstarct method creation using abstract name in the abstract class
}
class azha extends az{
    public int year=2023;
    public void study(){
        System.out.println("Studding all the days");

    }
}

public class abstracMethod {
    public static void main(String[] args) {
        azha obj=new azha();// we access the variavle ,method and classess using object dot name
        System.out.println("Name = "+obj.fname);
        System.out.println("Age = "+obj.age);
        System.out.println("Graduation year = "+obj.year);
        obj.study();//calling of abstract method
        
    }
    
}
