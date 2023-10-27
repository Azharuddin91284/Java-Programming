// Question. Input a string from the User. Create a new string called 'result' in which you will replace the letter 'e' in the original string with letter 'i'
//Example;  original = "eabcdef"; result="iabcdif"
// Original ="xyz"; result="xyz";
import java.util.*;
public class ReplaceCharAt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine();
        String result=" ";
        // here i used .CharAt() function which means it read the each character in the given String
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'e'){
                result += 'i';

            }
            else{
                result +=s.charAt(i);
            }
        }
        System.out.println(result);

    }
    
}
