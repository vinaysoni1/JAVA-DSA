import java.util.Scanner;
public class Inverted_pyramid {

     public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n= sc.nextInt();
      sc.close();

    //   outer loops
    for(int i=n; i>=1; i--){
        // inner loops
        for(int j=1;j<=i; j++){
            
                System.err.print("*");
        }
        System.out.println();
    }

    }
    

}
