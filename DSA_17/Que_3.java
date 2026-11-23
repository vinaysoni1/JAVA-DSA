public class Que_3 {
    // print sum of first natural number
    public static void calculateSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        calculateSum(i + 1, n, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        calculateSum(1, 5, 0);

    }
}
