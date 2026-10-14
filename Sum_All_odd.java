import java.util.Scanner;

public class Sum_All_odd {

    public static int sumAllOdd (int n){

        int sum =0;
        for(int i=1; i<=n; i++){
          if(i%2!=0){
            sum=sum+i;
          }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        sc.close();

        System.out.println("Sum of all odd number are: " +sumAllOdd(n));

    }
}
