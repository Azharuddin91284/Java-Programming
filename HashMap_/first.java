/*
 HashMap store items in "KEy/Value" pairs, and you can access them by an index of another type which is KEy(e.g.  string)
 here One object is used as a key(index) to another object(Value).It can store different types:  String keys and Integer values, or the same type, like String keys and String values
 HashMAp methods are = put(key,value),get(key),remove(key), size();
 */

package HashMap_;
import java.util.HashMap;

public class first {
    public static void main(String[] args) {
        System.out.println("here Key String and Value is also String");
        HashMap<String, String> az = new HashMap<String, String>();
        az.put("1","Azharuddin");
        az.put("2","Parwej");
        az.put("3","Ajbulllah");
        az.put("4","Juned");
        System.out.println(az);
        System.out.println("here key string and value Integer");

        HashMap<String,Integer> az_=new HashMap<String,Integer>();
        az_.put("Azhar", 1);
        az_.put("parwe", 2);
        System.out.println(az_);
        System.out.println("here key Integer and value Integer");

        HashMap<Integer,Integer> obj=new HashMap<Integer, Integer>();
        obj.put(2,20);
        obj.put(3,30);
        System.out.println("key interger and value String");
        HashMap<Integer,String> obj_=new HashMap<Integer,String>();
        obj_.put(1,"Azharuddin");
        obj_.put(2,"ParwejBHai");
        System.out.println(obj_);

        obj_.get(2);
        System.out.println(obj_.size());
        obj_.remove(2);
        obj_.put(2,"ParwejBHai");
        obj_.put(3,"Juned");
        obj_.put(4,"ajbullah");
        // for each loop  use keySet() method if you only wants the keys, 
        // use values() method if you only want the values
        System.out.println("*******print only keys*********");
        for(int i:obj_.keySet()){// for each loop keys are in integer
            System.out.println(i);
        }
        System.out.println("**************print only values*********");
        for(String i:obj_.values()){// values are in string
            System.out.println(i);
        }

        System.out.println("**************print keys and values together");
        for(int i:obj_.keySet()){
            System.out.println("key: "+i+" value: "+obj_.get(i));
        }

        // KEys and values i HashMAp are actually objects.
        System.out.println("*****************string keys and int  values************");
        az_.put("Ajbullah", 3);
        az_.put("juned", 4);
        for(String i:az_.keySet()){
            System.out.println("Name: "+i+" Index: "+az_.get(i));
        }

    }
    
}
