import java.io.*;
import java.util.Scanner;

class L18_1{
  void dataSum(String f) throws IOException{
    BufferedReader din = new LineNumberReader(new FileReader(f));
    String s;
    int result[] = new int[5];
    int sum = 0;
    int i = 0;
    while((s = din.readLine()) != null){
      System.out.println(s);
      String[] temp = s.split("\\s");  
      result[i] = Integer.parseInt(temp[1]);
      i++;
    }
    din.close();
    for(int j = 0; j < 5; j++)
      sum += result[j];
    System.out.println("合計 " + sum);
    for(int k = 0; k < 5; k++)
      System.out.print(result[k] + " ");
    System.out.println();
  }

  public static void main(String[] args){
    L18_1 r = new L18_1();
    try{
      r.dataSum(args[0]);
    }catch(IOException error){
      System.out.println("IOエラー発生");
    }
  }
}
