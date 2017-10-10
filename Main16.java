public class Main16{
  public static void main(String args[]){
    
    int i = 0;

    TurtleFrame f = new TurtleFrame();
    DrawPolygon m = new DrawPolygon();
    f.add((Turtle)m);
    Turtle.speedAll(1);
    
    while(i < 20){
      int x = (int)(Math.random() * 400);
      int y = (int)(Math.random() * 400);
      int corner = (int)(Math.random() * 8 + 3);
      int color = (int)(Math.random() * 3);
      m.draw(x, y, corner, color);
      m.calcArea(corner);
      m.display(corner);
      i++;
    }
  } 

}
