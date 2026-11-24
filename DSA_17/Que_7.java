public class Que_7 {
    // print x ki power n (height = logn)
    public static int powerOfn(int x, int n) {
        if (x == 0) { // base case 1
            return 0;
        }
        if (n == 0) { // base case 2
            return 1;
        }
        // if n is even
        if (n % 2 == 0) {
            return powerOfn(x, n / 2) * powerOfn(x, n / 2);
        } else {
            // if n is odd
            return powerOfn(x, n / 2) * powerOfn(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 2, n = 4;
        int res = powerOfn(x, n);
        System.out.println(res);
    }
}
