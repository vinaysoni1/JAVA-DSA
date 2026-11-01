import java.util.Scanner;

public class update_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a opration number: ");
        int opra = sc.nextInt();

        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;

        if (opra == 1) {

            // set
            int newnumber = bitmask | n;
            System.out.println(newnumber);
        } else {

            // clear
            int notbitmask = ~(bitmask);
            int number = notbitmask & n;
            System.out.println(number);
        }
        sc.close();

    }
}
