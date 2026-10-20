package DSA_10;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int [] marks = new int[3];
        // marks[0]=95;
        // marks[1]=96;
        // marks[2]=97;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // int [] marks = {12,13,14};
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        int [] number = new int[marks];


        // input
        for(int i=0; i<marks; i++){
            number[i]=sc.nextInt();
        }
        
        //output
        for(int i=0; i<marks; i++){
            System.out.print(" "+number[i]);
        }
        sc.close();
        
    }
    
}
