import java.util.Scanner;
public class Dymond_Shape {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();
    
        
        // upper side
        // outer loops
        for (int i = 1; i <= n; i++) {
            // inner loops
            for (int j = 1; j <= n - i; j++) 

                System.out.print(" ");

                for (int j =1; j<= 2 * i - 1; j++) {

                    
                    System.out.print("*");
                }
                

            System.out.println();
        }

        // lower side
         // outer loops
        for (int i = n; i >= 1; i--) {
            // inner loops
            for (int j = 1; j <= n - i; j++) 

                System.out.print(" ");

                for (int j =1; j<= 2 * i - 1; j++) {

                    
                    System.out.print("*");
                }
                

            System.out.println();
        }

    }

}
