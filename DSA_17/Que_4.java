public class Que_4 {
    //print factorial number of a N
    public static int  calFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_nm1 = calFactorial(n - 1);
        int fact = n * fact_nm1;
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calFactorial(n);
        System.out.println(ans);

    }
}
