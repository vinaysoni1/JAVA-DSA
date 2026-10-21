package DSA_11;

import java.util.*;
public class Prob1 {
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

         System.out.println("Eneter the valu of x: ");
        int x= sc.nextInt();

        // output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if(matrix[i][j]==x){
                    System.out.println("X fount at location is: (" + i  + "," + j+ ")");
                }

            }
            
        }



        sc.close();
    }


}
