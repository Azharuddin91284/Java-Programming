package Constructor;

class box{
    double width,height,length;
    box(){
        width=2;
        height=4;
        length=4;

    }
    double volume(){
        return width*height*length;
    }
}

public class constur__ctor {
    public static void main(String[] args) {
        box b=new box();
       double v= b.volume();
        System.out.println("Volume will be = "+v);
        
    }
    
}
