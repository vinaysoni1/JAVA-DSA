
import java.util.Scanner;

public class Sum_of_digit {

    public static void sumOfDigit(int n) {
        int sum = 0;

        while (n > 0) {
            int dig = n % 10;
            sum = sum + dig;
            n = n / 10;

        }
         System.out.println("Sum of digits: " + sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        sc.close();
        sumOfDigit(n);

    }

}
