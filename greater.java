import java.util.Scanner;
public class greater {
    
//  Write a function which takes in 2 numbers and returns the greater of those
// two
    public static int greaterOfTwoNums(int a ,int b){

       if(a>b){
        return a;
       }else{
        return b;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fast number : ");
        int a=sc.nextInt();
         System.out.println("Enter second number : ");
        int b=sc.nextInt();
        sc.close();

        System.out.println("Greter number is a : " + greaterOfTwoNums(a, b));

    }
}

