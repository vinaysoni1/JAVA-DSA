import java.util.Scanner;
public class Armstrong {
    public static void checkArmStrong(int n) {
// check plaidrome
        int original = n;
        int sum =0;
        int digits = String.valueOf(n).length();

        while (n>0) {

            int dig= n%10;
            sum =sum+ (int) Math.powExact(dig, digits);
            n=n/10;
            
        }
        
        if (original == sum) {
            System.out.println("ArmStrong");
        } else {
            System.out.println("Not ArmStrong");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        checkArmStrong(n);

    }

}


