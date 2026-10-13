import java.util.Scanner;
public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();

        // outer loops
        for (int i = 1; i <= n; i++) {


            // inner loops
            for (int j = 1; j <= n-i; j++) 
                // print space
                System.err.print(" ");

                for (int j = 1; j <= n; j++) 
                    System.out.print("*");
               
            System.out.println();
        }

    }

}
