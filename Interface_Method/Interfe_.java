interface Animal{
     void animalSound();
     void sleep();
}

class dog implements Animal{
        public void animalSound(){
            System.out.println("Animal sound are enabled");
        }
        public void sleep(){
            System.out.println("Animals are sleeping");
        }
    }
public class Interfe_ {
    public static void main(String[] args) {
         dog az=new dog();
         az.sleep();
         az.animalSound();
    
        
    }
   
}
