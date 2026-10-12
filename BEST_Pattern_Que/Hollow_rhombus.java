import java.util.Scanner;

public class Hollow_rhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();

        // outer loops
        for (int i = 1; i <= n; i++) {

            // inner loops
            for (int j = 1; j <= n - i; j++)
                // print space
                System.err.print(" ");
            if (i == 1 || i == n){
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
            }

                // star for Hollow row

                else{
                    for(int j=1; j<=n; j++){
                        if(j==1 || j==n){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    
                }
                System.out.println();
            }

        }

    }

