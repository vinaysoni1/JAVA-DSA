package DSA_10;

import java.util.Scanner;

public class Prob_num2 {

    // Take an array of names as input from the user and print them on the screen.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n = sc.nextInt();

        // input
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
        }

        // output
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name " + (i) + " is : " + name[i]);
        }
        sc.close();
    }

}
