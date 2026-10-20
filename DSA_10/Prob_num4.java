package DSA_10;

import java.util.*;

public class Prob_num4 {

    // Take an array of numbers as input and check if it is an array sorted in
    // ascending order.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n = sc.nextInt();
        // input
        int[] arr = new int[n];
        System.out.println("Enter input value: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isAscending = true;
        // output
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Arrays are Ascending order");
        } else {
            System.out.println("Arrays  are not Ascending order");
        }
        sc.close();
    }

}
