import java.util.Scanner;

public class Check_prime {

    public static void checkPrime(int n) {

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                System.out.println("Number is Not  Prime");
                return;
            }else{

                System.out.println("Number is  Prime");
            }
        }

        // return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        sc.close();
        checkPrime(n);

    }
}
