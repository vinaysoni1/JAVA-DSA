public class Que_3 {
    //place Tile of size 1*m in a floor of size n*m

    public static int placeTile(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;

        }
        // vartically
        int varticalPlace = placeTile(n - m, m);

        // horizonatal
        int horizonatal = placeTile(n - 1, m);

        return varticalPlace + horizonatal;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTile(n, m));

    }
}
