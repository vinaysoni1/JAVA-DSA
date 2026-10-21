package DSA_11;

import java.util.Scanner;

public class Spiral__matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();

        System.out.println("Enter the number of col: ");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();
        // output

        int row_start = 0;
        int row_end = row - 1;
        int col_start = 0;
        int col_end = col - 1;

        while (row_start <= row_end && col_start <= col_end) {

            // 1
            for (int i = col_start; i <= col_end; i++) {

                System.out.print(matrix[row_start][i] + " ");

            }
            row_start++;

            // 2
            for (int j = row_start; j <= row_end; j++) {
                System.out.print(matrix[j][col_end] + " ");
            }
            col_end--;

            // 3
            for (int k = col_end; k >= col_start; k--) {
                System.out.print(matrix[row_end][k] + " ");

            }
            row_end--;

            // 4
            for (int l = row_end; l >= row_start; l--) {
                System.out.print(matrix[l][col_start] + " ");
            }
            col_start++;
            System.out.println();

        }

    }

}
