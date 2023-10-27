package Polymorphism;
class Animal{
    public void animalSound(){
        System.out.println("The animal make a sound ");
    }
}

class dog extends Animal{
    public void animalSound(){
        System.out.println("The dog make a sound lika a bow bow");
    }
}

class pig extends Animal{
    public void animalSound(){
        System.out.println("The pig make a sound as a wee wee");
    }
}

public class main {
    public static void main(String[] args) {
        Animal obj1=new Animal();
        dog obj2=new dog();
        pig obj=new pig();
        obj1.animalSound();
        obj2.animalSound();
        obj.animalSound();

    }
    
}
