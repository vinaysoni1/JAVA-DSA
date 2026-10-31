public class DecimalToBinary {
  public StringBuilder getBinary(int num){
    StringBuilder ans=new StringBuilder("");
    while(num>1){
      int remd= num%2;
      ans.append(String.valueOf(remd));
      num=num/2;
    }
    ans.append("1");
    return ans.reverse();
  }
  public static void main(String[] args) {
    DecimalToBinary obj =new DecimalToBinary();
    int num=8;
    StringBuilder str= obj.getBinary(num);
    System.out.println(str);
  }
}