// Bit Mask: 1<<i, operation 'OR' so jo bit number find krna hai i=that number
//2nd bit mens position 1, 3rd bit means position 2;
package BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int n=5;//0101
        int poss=1;
        int Bitmass=1<<poss;//0010
        int Newbitnumber=n|Bitmass;
        System.out.println(Newbitnumber);//0111 =7

    }

    
}
