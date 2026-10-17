import java.util.Scanner;

public class Raise_to_power {

    public static int power(int x, int n){
        int res = 1;

        for(int i=1; i<=n; i++){
            res=res*x;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of x: ");
        int x =sc.nextInt();


        System.out.println("Enter the Number of n: ");
        int n =sc.nextInt();
        int ans = power(x,n);

       System.out.println("Power : " +ans);
        sc.close();


    }
}
