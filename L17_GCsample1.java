class L17_GCsample1{
  public static void main(String[] args){
    String s;
    long now = 0;
    while(true){
      for(int i = 0; i < 1000; i++)
        s = new String("abcdeifghijkmlnopqrstu");
      if(now != Runtime.getRuntime().freeMemory())
        System.out.println(Runtime.getRuntime().freeMemory());
      now = Runtime.getRuntime().freeMemory();
    }
  }
}
