import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        // int i = 12;
        // do{
        // System.out.println("Hello World!");
        // i++;
        // } while (i < 10);

        // do{
        // System.out.println("Hello World!"); //atleast one time print hoga chahe
        // condition false ho ya true
        // i++;
        // } while (i < 10);

        // Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        // If the user enters 1 then keep taking input from the user for a student’s
        // marks(out of 100).
        // If they enter 0 then stop.
        Scanner sc = new Scanner(System.in);
        int n;
        
        do{
            System.out.println("Enter 1 to continue or 0 to exit: ");
             n = sc.nextInt();
            if(n==1){
                System.out.println("Enter marks of student: ");
                int marks = sc.nextInt();
                if(marks>=90){
                    System.out.println("This is Good");
                } else if(89>=marks && marks>=60){
                    System.out.println("This is also Good");
                } else if(59>=marks && marks>=0){
                    System.out.println("This is Poor");
                }else{
                    System.out.println("Fail");
                }
            } else if(n==0){
                System.out.println("Exiting the program.");
            } else{
                System.out.println("Invalid input. Please enter 1 or 0.");
            }

        } while (n != 0);

        sc.close();

    }
}
