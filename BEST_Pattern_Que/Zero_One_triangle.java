import java.util.*;
class Zero_one_triangle{
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n :");
      int n= sc.nextInt();

      sc.close();
        // /outer loops
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=i; j++){
            int sum = i+j;
            if(sum%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }

            }
            System.out.println();
        }
    }

}
