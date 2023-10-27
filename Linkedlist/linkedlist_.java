/*Linkedlist class is almost identical to ArrayList
ArrayList working= Arraylist class has a regular array inside it.When an element is added, it is placed intomthe array. if the array is not big enough, a new larger array is created to replace the old one is removed.

LinkedList working = Linkedlist stores its items in "Containners" the list has a link yo the first container and each container has a linnk to the next container in the list. to add an elemenet is placed into a new container and that container is linked to one of the other containers in the list.

simple way: Use an ArrayList for storing and accessing data, and LinkedList to manipulating data.
LinkedList methods= addFirst(), addLast(),removeFirst(),removeLast(),getFirst(),getLast().
 
 */

package Linkedlist;
import java.util.LinkedList;

public class linkedlist_ {
    public static void main(String[] args) {
        LinkedList<String> car = new LinkedList<String>();
        car.add("Volvo");
        car.add("BMW");
        System.out.println(car);
        System.out.println(car.size());

        //use addFirst() to add item in beginning of the list
        car.addFirst("Azhar");
        System.out.println(car);
        car.addLast("azhar");
        System.out.println(car);
        // use removeFirst() to remove item from the beginning of the list
        car.removeFirst();
        car.removeLast();
        System.out.println(car);
        // use getFirst() to get the item at beginning of the list
        System.out.println(car.getFirst());
        System.out.println(car.getLast());
    }
    
}
