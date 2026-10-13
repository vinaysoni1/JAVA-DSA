import java.util.Scanner;

public class Half_Pyramid {

     public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n= sc.nextInt();
      sc.close();

    //   outer loops
    for(int i=1; i<=n; i++){
        // inner loops
        for(int j=1;j<=i; j++){
            
                System.err.print("*");
        }
        System.out.println();
    }

    }
    
}
