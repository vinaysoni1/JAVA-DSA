import java.util.Scanner;
public class Check_Even {

    public static void checkEven(int n) {

        

            if (n % 2 == 0) {
                System.out.println("Number is even");
                return;
            }else{

                System.out.println("Number is not Even ");
            }
        

        // return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        sc.close();
        checkEven(n);

    }
}
