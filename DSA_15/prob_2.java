public class prob_2 {
    public static void main(String[] args) {
        // Write a program to toggle a bit a position = “pos” in a number “n”.
        int n=10;
        int pos=1;
        int bitmask = 1<<pos;

        int newnumber = bitmask ^ n;
        System.out.println(newnumber);

    }
}
