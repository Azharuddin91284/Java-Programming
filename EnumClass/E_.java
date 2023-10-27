package EnumClass;
// basically enum is used to represent constant values like day month year ,you know aren't going to change like month,days,colors,deck of card
//an enum can just like a class have attributes method. the only difference is that enum constant are"Public,static,final(unchangible, canot be verriden)
// An "enum canot be used to creaetto object, and it canot extend other classes(but it implements interfce)"

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class E_ {
    public static void main(String[] args) {
        Level myVar=Level.MEDIUM;
        System.out.println(myVar);
    }
    
}
