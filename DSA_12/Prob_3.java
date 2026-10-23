package DSA_12;

import java.util.Scanner;

public class Prob_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String emaail = sc.next();

        String username = "";

        for (int i = 0; i < emaail.length(); i++) {
            if (emaail.charAt(i) == '@') {
                break;
            } else {
                username += emaail.charAt(i);
            }
        }
        System.out.println(username);
        sc.close();
    }
}
