import java.util.*;
public class Inverted_half_pyramid_with_no {
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n= sc.nextInt();
      sc.close();
        // /outer loops
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



