import java.io.*;
import java.util.Scanner;

class L18_2{
  void dataDraw(String f) throws IOException{
    Scanner sc = new Scanner(new BufferedReader(new FileReader(f)));
    FileWriter fileout = new FileWriter("data2.txt");
    BufferedWriter buffout = new BufferedWriter(fileout);
    int i = 0;
    int result[] = new int[5];
    while(sc.hasNextInt()){
      buffout.write(sc.nextInt() + ",");
      buffout.newLine();
    }
    buffout.close(); 
  }

  public static void main(String[] args){
    L18_2 r = new L18_2();
    try{
      r.dataDraw(args[0]);
    }catch(IOException error){
      System.out.println("IOエラー発生");
    }
  }
}
