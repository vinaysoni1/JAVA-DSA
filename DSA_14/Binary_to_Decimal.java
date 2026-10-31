public class Binary_to_Decimal {

    static int binaryToDecimal(int num) {
        // binary to decimal conversion
        int n = num;
        int res = 0;
        int base = 1;
        int temp = n;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            res += last_digit * base;
            base = base * 2;

        }
        return res;
    }

    public static void main(String[] args) {

        int num = 10101001;
        System.out.println(binaryToDecimal(num));
    }
}
