package DSA_10;

import java.util.*;

public class Prob_num3 {

    // Find the maximum & minimum number in an array of integers.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n = sc.nextInt();

        // input
        int[] nums = new int[n];
        System.out.println("Enter input value: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        // output
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]<min) {
                min = nums[i];

            }
            if ( nums[i]>max) {
                max = nums[i];
            }

        }
        System.out.println("largest number is: " +max);
        System.out.println("Smallest number is: " +min);
        sc.close();
    }

}
