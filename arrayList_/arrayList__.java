package arrayList_;
//ArrayList me object stroded hote so easily add, modification and delete kr skte hai noncontigious size changible 
// arrayList which is complettely stored in Heap

// simple array me object and primitive data types stode hote contigious memory allocation soize not changible
//import java.util.*  me all classes and extra clsees are also import so it takes more spaces so we can't use in big project in that we import individual classes according sto requrement
import java.util.Collections;
import java.util.ArrayList;
public class arrayList__ {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        //ArrayList<String> list1 =new ArrayList<String>();
        // add element in the list
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        // get the element from the list
        int element=list.get(2);
        System.out.println(element);

        System.out.println(list.get(1));

        // to add element in between
        list.add(1,5);
        System.out.println(list);

        // set element in the list

        list.set(0,4);
        System.out.println(list);

        //Delete elemet from the list
        list.remove(2);

    System.out.println(list);

    // find size of list
    int size=list.size();
    System.out.println(size);

    //loops apply at arraylist print the vlaue of list
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i));
    }
    System.out.println();
    //sorting  collection is class in which built sorting algorith
    Collections.sort(list);
    System.out.println(list);
    
        

        
    }

    
}

