package Constructor;
import java.util.*;
public class constructor_{
        public static void main(String[] args){
        azhar t=new azhar("azharuddin",13,90,9);//parametrised constructor call by using object of the parent constructor that's all
        System.out.println(t.name+" "+t.rollno+" "+t.marks+" "+t.sub);
       
    }
}

class constructor__ {
    String name;
    int rollno;
    constructor__(String name, int rollno){//child constructor
        this.name = name;
        this.rollno = rollno;
    }
    
}
class azhar extends constructor__ {//inheritance
    int marks;
    int sub;
    azhar(String name, int rollno, int marks, int sub){//parent constructo
        super(name,rollno);
        this.marks = marks;
        this.sub=sub;
    }
    
}
