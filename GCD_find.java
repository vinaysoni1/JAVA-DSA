import java.util.Scanner;

/**
 * GCD_find
 */
public class GCD_find {

    public static int findGCD(int a, int b ){

        int gcd =1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){

                gcd=i;
            }
        }
        return gcd;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fast number: ");
        int a = sc.nextInt();

         System.out.println("Enter second number: ");
        int b= sc.nextInt();

        int res = findGCD(a, b);
        System.out.println("GCD are: " +res);
        sc.close();
        
    }

    
}