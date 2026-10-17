import java.util.Scanner;

public class Fabonacci_series {

    public static int fibonacci(int n) {
        int fast = 0;
        int Second = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(fast +" ");
            int next = fast + Second;
            fast = Second;
            Second = next;
        }
    return fast;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series is : ");
        fibonacci(n);
        sc.close();

    }
}
