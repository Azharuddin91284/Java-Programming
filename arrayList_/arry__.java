package arrayList_;

import java.util.ArrayList;
import java.util.Collections;

public class arry__ {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(70);
        number.add(50);
        number.add(60);
        number.add(90);
        System.out.println(number);
        System.out.println("*********************");
        Collections.sort(number);
        for(int i = 0; i < number.size(); i++){// for loop iteration
            System.out.println(number.get(i));
        }

        System.out.println("Size of ArrayList: " + number.size());
        for(int i : number){// for each loop
            System.out.println(i);
        }
    }
    
}
