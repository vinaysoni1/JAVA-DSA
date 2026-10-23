package DSA_12;

public class Str_Comapare {
    public static void main(String[] args) {
        String s1 = "Vinay";
        String s2 = "Vinay";

        // checking three casse
        // s1==s2 ret 0
        // s1>s2 ret +ve
        // s1<s2 ret -ve

        // 1 right o/p
        if (s1.compareTo(s2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // 2 sahi o/p
        if (s1 == s2) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // 3  output fail
        if (new String("vinay") == new String("vinay")) {
            System.out.println("String are equal");
        } else {
            System.out.println("String  are not equal");
        }

        // substring
        String Sentance = "My name is vinay";
        String name = Sentance.substring(11,Sentance.length());
        System.out.println(name);

        // String are immutable

    }
}
