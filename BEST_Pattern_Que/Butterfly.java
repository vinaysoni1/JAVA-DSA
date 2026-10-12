import java.util.*;

class Butterfly{
    public static void main(String [] args ) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows: ");
        int n = sc.nextInt();
        sc.close();

        //upper half
        for(int i=1; i<=n; i++){

            //fast part 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space
            int Space = 2*(n-i);
            for(int j=1; j<=Space; j++){
                System.out.print(" ");
            }

            //Second part 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower Half
         for(int i=n; i>=1; i--){

            //fast part 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space
            int Space = 2*(n-i);
            for(int j=1; j<=Space; j++){
                System.out.print(" ");
            }

            //Second part 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}