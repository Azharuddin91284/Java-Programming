// Bit Mask: 1<<i, operation 'AND' so jo bit number find krna hai i=that number

package BitManipulation;

public class GetBit {
    public static void main(String[] args) {
        int n=5;//0101
        int poss=2;
        int Bitmass=1<<poss;//0100
        int Newbitnumber=Bitmass & n;//0100
        System.out.println(Newbitnumber);//0100 here at the 2nd possition 1 is there
        if((Bitmass & n) ==0){
            System.out.println("Bit was zero");

        }else{
            System.out.println("Bit was one");
        }
        
    }
    
}
