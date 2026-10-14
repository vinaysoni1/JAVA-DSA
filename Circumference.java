import java.util.Scanner;
public class Circumference {
    // Write a function that takes in the radius as input and returns the
// circumference of a circle
    public static double circumference(int r) {

        double Pai = 3.14;
        double circumference = 2*Pai*r;
        return circumference;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Radius of circumference : ");
        int r = sc.nextInt();
        // int Pai = 3.14;

        sc.close();
       System.out.println("circumference is a :" +circumference(r)); 
        

    }
}
