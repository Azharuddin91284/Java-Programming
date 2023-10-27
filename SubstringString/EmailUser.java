/*Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'. Display that username to the user.
Example;
email="ansariazharuddin915@gmail.com";
Username="ansariazharuddin915";
*/


import java.util.*;
public class EmailUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email ");
        String s=sc.nextLine();
        String Username=" ";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '@'){
                break;
            }
            else{
                Username +=s.charAt(i);
            }
        }
        System.out.println("Username of the user is "+Username);
    }
    
}
