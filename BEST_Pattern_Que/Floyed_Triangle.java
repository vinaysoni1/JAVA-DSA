import java.util.*;
public class Floyed_Triangle {

    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n= sc.nextInt();

       System.out.println("Enter the number :");
      int number = sc.nextInt();

      sc.close();
        // /outer loops
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number +" ");
                number++; //number=number+1;
            }
            System.out.println();
        }
    }

}
