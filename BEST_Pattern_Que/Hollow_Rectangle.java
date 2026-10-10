import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n= sc.nextInt();
      System.out.println("Enter the value of m :");
      int m = sc.nextInt();
      sc.close();

    //   outer loops
    for(int i=1; i<=n; i++){
        // inner loops
        for(int j=1;j<=m; j++){
            if( i==1 || j==1 || i==n || j==m){
                System.err.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    }
}
