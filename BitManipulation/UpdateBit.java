// Bit Mask: 1<<i, operation: 'AND with NOT'  for clear bit by 0 so jo bit number clear krna hai i=that number
// Bit Mask: 1<<i, operation: 'OR' fro set bits by 1;

package BitManipulation;
import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the bit number");
    int operation=sc.nextInt();
    int n=5;//0101
    int poss=1;
    int Bitmass=1<<poss;//0010
    //set the bit by 1;
    if(operation==1){
        int Newbitnumber=Bitmass |n;
        System.out.println(Newbitnumber);//if 1 then 0111=7
    }else{
        int NotBitnumber=~Bitmass;//1101
        int Newbitnumber=NotBitnumber & n;
        System.out.println(Newbitnumber);//if 0 then 0101=5
    }
}
}
