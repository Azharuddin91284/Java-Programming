package arrayList_;
import java.util.ArrayList;
import java.util.Collections;

public class collectionArray_ {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Tesla");
         for(int i=0; i<car.size(); i++) {
            System.out.println(car.get(i));
        }
        System.out.println("****************************************");
        
        Collections.sort(car);//sort car
        System.out.println(car);
        System.out.println(car.size());
        System.out.println("********************************");
        for(String i : car){//for each loop 
            System.out.println(i);
        }
    }

    
}
