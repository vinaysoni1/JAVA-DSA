package DSA_11;

import java.util.Scanner;

public class count_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int row = sc.nextInt();

        System.out.println("Enter the number of col:");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int odd = 0;
        int even = 0;

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(matrix[i][j] + " ");

                if (matrix[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println();
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        sc.close();

    }
}
