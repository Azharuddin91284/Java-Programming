interface maths{
    void area(int r);
    double pi=3.14;

}
class type1 implements maths{
    public void area(int r){
        System.out.println("Area of the circle = "+(pi*r*r));
    }
}
class type2 implements maths{
  public  void area(int r){
        System.out.println("Area of the sphere = "+(4*pi*r*r));
    }
}


public class Interface_ {
    public static void main(String[] args) {
        type1 circle=new type1();
        type2 sphere=new type2();
        circle.area(5);
        sphere.area(4);

    }
    
}
