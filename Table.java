import java.util.Scanner;
public class Table{
    public static void createTable(int n) {
        for (int i = 1; i <= 10; i++) {
            int table = n * i;
             System.out.println(table);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        sc.close();
        createTable(n);

    }
}
