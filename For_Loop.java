import java.util.*;
class For_Loop{
    public static void main (String [] args){
        // for(int counter=0; counter<100; counter=counter+1){
        //     System.out.println("Hello World!");
        // }

        // print 1 to 10
        // for(int counter=1; counter<=10; counter++){
        //     System.out.print(counter +" ");
        // }

        // sum of first 10 natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // int sum = 0;
        // for(int i=1; i<=n; i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);
        sc.close();

        // print multiplication table of n
        // for(int i=1; i<=10; i++){
        //     System.out.println(i*n);
        // }

        // print all even numbers from 1 to n
        // for(int i=1; i<=n; i++){
        //     if(i%2==0){
        //         System.out.print(i+" ");
        //     }
        // }

        // print all odd numbers from 1 to n
        // for(int i=1; i<=n; i++){
        //     if(i%2!=0){
        //         System.out.print(i+" ");
        //     }
        // }

        // print all prime numbers from 1 to n
        if(n<=1){
            System.out.println("No prime numbers in this range.");
        } else {
            if(n>=1){
                if(n%2==0 && n!=2){
                    System.out.println("Not a prime number");
                } else {
                    System.out.println("Prime number");
                }
               
            }
        }
    }

}