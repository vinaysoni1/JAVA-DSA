import java.util.Scanner;
public class Palindrom_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();
        // int ans =1;
        // int res=0;
        

        // outer loops
        for (int i = 1; i <= n; i++) {
            // inner loops
            for (int j = 1; j <= n - i; j++) 

                System.out.print(" ");

                for (int j =1; j<=i; j++) {

                    
                    System.out.print(j);
                }
                
                for (int j =i-1; j>=1; j--) {

                    
                    System.out.print(j);
                }

                

            System.out.println();
        }

    }


}
