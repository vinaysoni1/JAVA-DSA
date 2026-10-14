import java.util.Scanner;

public class Factorial {

    // factorial
    public static void calculateFac(int n){


        if(n<0){
            System.out.print("Invalid Number");
            return ;
        }
        
        int res = 1;
        for(int i=n; i>=1; i--){
             res = res*i;
        }

        System.out.print(res);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        sc.close();
        calculateFac(n);

    }
}
