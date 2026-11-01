import java.util.Scanner;

public class prob_1 {
    public static void main(String[] args) {
        // Write a program to find if a number is a power of 2 or not.
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =sc.nextInt();
        sc.close();
        int num=n;

        if(num<=0){
            System.out.println("not a power of two");
        }else{
            while(n%2==0){
                n= n/2;
            }
            if(n==1){
                 System.out.println(num + " is a power of 2");
            }else{
                 System.out.println(num + " is not a power of 2");
            }
        }
    }
}
