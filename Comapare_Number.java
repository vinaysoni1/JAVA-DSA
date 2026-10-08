import java.util.*;
public class Comapare_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a==b){
            System.out.println("both Equal");
        }
        // }else{
        //     if(a>b){
        //         System.out.println("a is greater than b");
        //     }else{
        //         System.out.println("b is greater than a");
        //     }
        // }

        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
}
