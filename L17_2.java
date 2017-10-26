public class L17_2{
  public static void main(String[] args){
    try{
      System.out.println(division(Integer.parseInt(args[0]), Integer.parseInt(args[1]))); 
    }catch(NumberFormatException e){
      System.out.println("数字以外が入力されました");
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("数字を入力してください");
    }
  }
  static int division(int divided, int divisor){
    int ans = 0;
    try{
      ans = divided / divisor;
    }catch(ArithmeticException e){
      System.out.println("0除算エラーです");
    }
    return ans;   
  }
}
