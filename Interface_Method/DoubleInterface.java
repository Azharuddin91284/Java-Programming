interface Animal{
     void animalSound();
     
}
interface secondAnimal{
    void sleep();

}

class dog implements Animal , secondAnimal{
        public void animalSound(){
            System.out.println("Animal sound are enabled");
        }
        public void sleep(){
            System.out.println("Animals are sleeping");
        }
    }
public class DoubleInterface {
    

    public static void main(String[] args) {
         dog az=new dog();
         az.sleep();
         az.animalSound();
    
        
    }
}
   


