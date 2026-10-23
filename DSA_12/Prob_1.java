package DSA_12;

import java.util.Scanner;

public class Prob_1 {

    // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of String: ");
        int n = sc.nextInt();

        String [] arr = new String[n];
        int totalLength =0;

        for(int i=0; i<n; i++){
            arr[i]=sc.next();
            totalLength +=arr[i].length();
        }
        System.out.println(totalLength);

        sc.close();
    }
}
