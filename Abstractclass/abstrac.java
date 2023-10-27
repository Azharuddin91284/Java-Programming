package Abstractclass;


    //abstract 
    class azhar{
        String name;
        int age;
        azhar(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    class azhar1 extends azhar{
        int marks;
        int id;
        public azhar1(String name,int age,int marks,int id){
            super(name, age);
            //this.name=name;
            //this.age=age;
            this.marks=marks;
           this.id=id;

    }
}
    public class abstrac {
        public static void main(String[] args) {
            azhar1 sc=new azhar1("Azharuddin Ansari", 20, 90,201);
            System.out.println(sc.name+" "+sc.age+" "+sc.marks+" "+sc.id);
        }

    }
