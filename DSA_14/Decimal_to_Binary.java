public class Decimal_to_Binary {

    static StringBuilder decimalTobinary(int n) {

        StringBuilder ans = new StringBuilder("");
        while (n > 1) {
            int rem = n % 2;
            ans.append(String.valueOf(rem));
            n = n / 10;

        }
        ans.append('1');
        return ans.reverse();

    }

    public static void main(String[] args) {
        // Decimal_to_Binary obj = new Decimal_to_Binary();
        int n = 10;
        StringBuilder str = Decimal_to_Binary.decimalTobinary(n);
        // int res = decimalTobinary(n);
        System.out.println(str);
    }
}
