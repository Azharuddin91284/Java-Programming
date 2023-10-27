package Inheritance;

class bm {
    protected String name="Bm w car";
    public void car(){
        System.out.println("Especial car  ");
    }
    
}
class model extends bm {
    private String COLOR="red";
   
    public static void main(String[] args) {
         model az=new model();
        System.out.println(az.name);
        System.out.println(az.COLOR);
        az.car();
    }
}
