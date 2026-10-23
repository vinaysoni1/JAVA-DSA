package DSA_12;
// Input a string from the user. Creazte a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.Scanner;

public class Prob_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Original String");
        String original = sc.next();

        String result = "";


        for(int i=0; i<original.length(); i++){
            if(original.charAt(i)=='e'){
                result +='i';
            }
            else{
                result += original.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}
