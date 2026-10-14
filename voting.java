import java.util.Scanner;
public class voting{
    
//  Write a function that takes in age as input and returns if that person is eligible
// to vote or not. A person of age > 18 is eligible to vote.
    public static void check_Vote(int age){

      if(age>18){
        System.out.println("A person eligible to vote");
        return ;
      }
      else{
        System.out.println("A person Not eligible to vote");
      }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age : ");
        int age =sc.nextInt();
      
        sc.close();

        check_Vote(age);

        

    }
}

