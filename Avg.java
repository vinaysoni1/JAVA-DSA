import java.util.*;
public class Avg {

    public static int Avg_Three(int a, int b, int c){
        
        int avg =(a+b+c)/3;
        return avg;
    }

    // Enter 3 numbers from the user & make a function to print their average
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fast number a : ");
        int a = sc.nextInt();

         System.out.println("Enter Second number b : ");
        int b = sc.nextInt();

         System.out.println("Enter Third number c : ");
        int c = sc.nextInt();
        sc.close();


         double  res = Avg_Three(a,b,c);
         System.out.println("Average of Three Number is: " +res);


        
    }
}
