import java.util.Scanner;

public class rev {

    public static void revNumber(int n){
        int rev =0;
        while (n>0) {
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        System.out.println("Rev number is :" +rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a Number: ");
        int n = sc.nextInt();
        revNumber(n);
        sc.close();

    }
}
