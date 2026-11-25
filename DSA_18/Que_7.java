public class Que_7 {

    public static void subSequence(String str, int idx, String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar= str.charAt(idx);
        // to be
        subSequence(str, idx+1, newString+currChar);

        // to be not
        subSequence(str, idx+1, newString);
    }
    public static void main(String[] args) {

        String str = "abcd";
        subSequence(str, 0, "");
        
    }
}
