/*String Builder Concept 
 it can perform operations like deleting, adding operation perform easily with the String
 StringBuilder ke case me New string add krne ke liye new variable or object create nhi krna pdta hai direct functionality forform kr skte hai

 Data are stored in the memory as variable are sstored in stack and
  Location of the variables(Which is value of the variable) are pointed in Heap
 */
import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
        // Declaration of String builder
        // StringBuilder stringName=new StringBuilder("String pass kr denge");
        StringBuilder sb = new StringBuilder("Azhruddin");
        System.out.println(sb);
        // print Character at any index
        System.out.println(sb.charAt(0));
        // Set char at any index using setCharAt(index,  value of char)
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        // inset the new char at any index and string index will be  shifted  insert(index, char);
        sb.insert(1, 'A');
        System.out.println(sb);

        sb.setCharAt(0, 'A');
        System.out.println(sb);

        //delete the extra character uusing .delete(0,3) 0-2 charcter are deleted
        sb.delete(0,1);// 0 index is deleted
        System.out.println(sb);

        // append krna means last me add krna
        sb.append(" ");
        sb.append("A");// in case of String  str = str + " A";
        sb.append("N");// str = Str + "N";     in each case new memory location will be created in heap
        sb.append("S");
        sb.append("A");
        sb.append("R");
        System.out.println(sb + " " +sb.length());



        
    }

    
}
