import java.util.Scanner;

public class Add_two_number {

    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();

         System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        sc.close();

        int sum =calculateSum(a,b);
        System.out.println( "Sum of a & b  is: "+sum);

    }
}
