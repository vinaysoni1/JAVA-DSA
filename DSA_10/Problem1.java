package DSA_10;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrays n: ");
        int n = sc.nextInt();

        int[] number = new int[n];


        // input
        System.out.println("Enter input of Array");
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Search index: ");

        int x = sc.nextInt();

        // output
        for (int i = 0; i < number.length; i++) {
            if (x == number[i]) {
                System.out.println("x found at index: " +i);
            }

        }
        sc.close();

    }

}
