public class Que_6 {
    // print x ki power n 
    public static int powerOfn(int x, int n) {
        if (x == 0) {   //base case 1
            return 0;
        }
        if (n == 0) { // base case 2
            return 1;
        }
        int pownm1 = powerOfn(x, n - 1); //work
        int xpown = x * pownm1;
        return xpown;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int res = powerOfn(x, n);
        System.out.println(res);
    }
}
