import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        
    Scanner az=new Scanner(System.in);
    System.out.println("Enter the row values:");
    int row=az.nextInt();
    System.out.println("Enter the colume values:");
    int col=az.nextInt();
    
    for(int i=0;i<=row;i++){
        for(int j=0;j<=col;j++){
        if(i==0 || i==row || j==0 || j==col )
            System.out.print("*");
        else
            System.out.print(" ");

        }
        System.out.println();
      
    }
    System.out.println("Another pattern");

    for(int i=0;i<=row;i++){
        for(int j=0;j<=col;j++){
        System.out.print("*");

        }
        System.out.println();
      
    }

    System.out.println("This is another pattern: ");

    for(int i=0;i<=row;i++){
        for(int j=0;j<=col;j++){
        System.out.print(j);

        }
        System.out.println();
      
    }
    System.out.println("This is another pattern: ");

    for(int i=0;i<=row;i++){
        for(int j=0;j<=i;j++){
        System.out.print(i);

        }
        System.out.println();
      
    }

    System.out.println("This is another pattern: ");

    for(int i=0;i<=row;i++){
        for(int j=0;j<=i;j++){
        System.out.print("*");

        }
        System.out.println();
      
    }

    System.out.println("This is another pattern: ");

    for(int i=row;i>=1;i--){
        for(int j=1;j<=i;j++){
        System.out.print(i);

        }
        System.out.println();
      
    }
}
}

 
    
