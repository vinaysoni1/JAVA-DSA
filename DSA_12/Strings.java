package DSA_12;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fast name: ");
        String Fname = sc.nextLine();

        System.out.println("Enter your Last name: ");
        String Lname = sc.nextLine();

        // concatenation
        String Fullname = Fname + "@" + Lname; //" " use create space
        // System.out.println(Fullname);
        // System.out.println(Fullname.length());  print String Length

        // charAt
        for(int i=0; i<Fullname.length(); i++){
            System.out.println(Fullname.charAt(i));
        }
        sc.close();
    }

}
