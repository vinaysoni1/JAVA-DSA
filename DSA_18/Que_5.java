public class Que_5 {
    public static void moveTox(String str, int idx, int count, String newString) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveTox(str, idx + 1, count, newString);
        } else {
            newString += currChar;
            moveTox(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {

        String str = "axbcxxd";
        moveTox(str, 0, 0,"");

    }
}
