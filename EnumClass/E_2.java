package EnumClass;


    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public class E_2 {
    
        public static void main(String[] args) {
           for( Level myVar:Level.values()){
            System.out.println(myVar);
        }
        
    }
}
