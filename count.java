import java.util.Scanner;


// Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive, negative and zeros entered.

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative =0;
         int zero= 0;
         char choice;

         do{

            System.out.println("Enter a number n: ");
            int n =sc.nextInt();

            if(n>0){
                positive++;
            }else if(n<0){
                negative++;

            }else{
                zero++;
            }

            System.out.println("Do you want to continue (Y/N) ? : ");
            choice=sc.next().charAt(0);

         }while(choice=='y' || choice=='y');

         System.out.println("Positive number : "  +positive);
         System.out.println("Negative number : "  +negative);
         System.out.println("Zero number : "  +zero);
         sc.close();
    }
}
