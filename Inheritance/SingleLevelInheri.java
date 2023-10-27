package Inheritance;
class azhar{
    int i,j;
    public void area(int l,int h){
        System.out.println("Displays area");
        i=l;
        j=h;


    }
}

class sinheri extends azhar{
    int total;
        public void area1()
        {
             total=(i*j)/2;

        }
    }

public class SingleLevelInheri {
   
    public static void main(String[] args) {
        sinheri s1=new sinheri();

        s1.area(2,4);
        s1.area1();
        System.out.println("Area will be = "+s1.total);
        
    }
    
}
