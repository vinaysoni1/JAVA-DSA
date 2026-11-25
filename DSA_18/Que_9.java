public class Que_9 {
    public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void combination(String str , int idx, String combinations){

        if(idx==str.length()){
            System.out.println(combinations);
            return ;
        }
        char currchar = str.charAt(idx);
        String mapping =keypad[currchar-'0'];
        for(int i= 0; i<mapping.length(); i++){
            combination(str, idx+1, combinations+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        combination(str, 0, "");
    }
}
