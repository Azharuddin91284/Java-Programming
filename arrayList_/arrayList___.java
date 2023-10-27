package arrayList_;
import java.util.ArrayList;

public class arrayList___ {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Tesla");
        for(int i=0; i<car.size(); i++) {
            System.out.println(car.get(i));

        }
    
}
}
