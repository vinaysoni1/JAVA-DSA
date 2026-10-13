import java.util.Scanner;
public class Product {


    // Product of two number
    public static int calculateProduct(int a, int b){
        
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();

         System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        sc.close();

        System.out.println( "Product of a & b  is: "+ calculateProduct(a,b));

    }
}


