package EnumClass;

public class E__ {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    
        public static void main(String[] args) {
            Level myVar=Level.values()[0];// Level.LOW
            System.out.println(myVar);
        }
        
    }
    
