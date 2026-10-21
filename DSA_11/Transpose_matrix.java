package DSA_11;

import java.util.*;

public class Transpose_matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row: ");
        int row = sc.nextInt();
        System.out.println("Enter number of col: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter input: ");

        // input
        // row
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

        // output
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {

                System.out.print(matrix[j][i] + " ");

            }
            System.out.println();
        }

        sc.close();
    }

}
