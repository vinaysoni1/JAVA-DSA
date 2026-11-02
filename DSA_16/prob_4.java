import java.util.Scanner;

public class prob_4 {

    static void BinaryToDecimal(int a) {

        int decimal = 0;
        int pow = 1;
        while (a > 0) {
            int rem = a % 10;
            decimal = decimal + rem * pow;
            pow = pow * 2;
            a = a / 10;
        }
        System.out.println("Decimal Number is: " + decimal);

    }

    static void DecimalToBinary(int b) {

        int binary =0; 
        int pow = 1;

        while (b>0) {
            int rem = b%2;
            binary = binary+ rem*pow;
            pow=pow*10;
            b=b/2;
        }
        System.out.println("Binary Number is: " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int a = sc.nextInt();
        BinaryToDecimal(a);

        System.out.print("Enter a decimal number: ");
        int b = sc.nextInt();
        DecimalToBinary(b);

        sc.close();
    }
}
