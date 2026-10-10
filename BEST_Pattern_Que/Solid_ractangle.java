import java.util.*;

class Solid_ractangle{
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n= sc.nextInt();
      System.out.println("Enter the value of m :");
      int m = sc.nextInt();
      sc.close();

        // int n=4;
        // int m=5;

        // /outer loops
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}