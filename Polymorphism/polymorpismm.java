// Polymorphism means  ek method ko many ways use kr skte hai here printInfo method ko three purpose ke liye use kia gya hai
package Polymorphism;
class azhar{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}

public class polymorpismm {
    public static void main(String[] args) {
        azhar sc=new azhar();
        sc.name="Azharuddin";
        sc.age=24;
        sc.printInfo(sc.name);
        sc.printInfo(sc.name, sc.age);
    }
    
}
