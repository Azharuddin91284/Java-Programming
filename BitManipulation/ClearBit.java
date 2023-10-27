// Bit Mask: 1<<i, operation: 'AND with NOT' so jo bit number find krna hai i=that number
package BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n=5;//0101
        int poss=1;
        int Bitmass=1<<poss;//0010
        int NegatBit=~Bitmass;//1101
        int NewNumber=NegatBit & n;//0101
        System.out.println(NewNumber);
        
    }
    
}
