import java.io.*;
import java.util.Scanner;

class L18_1{
  void dataSum() throws IOException{
    Scanner sc = new Scanner(new BufferedReader(new FileReader("seiseki.txt")));
    int sum = 0;
    while(sc.hasNextInt()){
      sum += sc.nextInt();
    }
    sc.close();
    System.out.println(sum);
  }

  public static void main(String[] args){
    L18_1 r = new L18_1();
    try{
      r.dataSum();
    }catch(IOException error){
      System.out.println("IOエラー発生");
    }
  }
}
