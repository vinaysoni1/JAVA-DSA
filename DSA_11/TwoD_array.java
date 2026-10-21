 package DSA_11;
import java.util.*;

public class TwoD_array {
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

        // otput
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(matrix[i][j] +" ");

            }
            System.out.println();
        }



        sc.close();
    }

}
