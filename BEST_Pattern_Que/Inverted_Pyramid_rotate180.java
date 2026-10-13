import java.util.Scanner;
public class Inverted_Pyramid_rotate180 {

     public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n= sc.nextInt();
      sc.close();

    //   outer loops
    for(int i=1; i<=n; i++){
        // inner loops
        for(int j=1;j<=n-i; j++){
            
                System.err.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
      
    }

    }
    

}


