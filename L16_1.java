import java.awt.Color;

interface Drawable2{

  public void draw(int x, int y, int corner, int color);
  public void calcArea(int corner);
  public void display(int corner);

}

class DrawPolygon extends Turtle implements Drawable2{

  double r = 0;
  int a = 0;
  double s = 0;

  public void draw(int x, int y, int corner, int color){
    r = Math.random() * 100;
    a = (int)(2 * r * Math.tan(Math.PI / corner)); 
    Color[] c = {Color.red, Color.blue, Color.yellow};
    setColor(c[color]);
    up(); moveTo(x, y, 0);
    fd((int)r); rt((360 / corner) + (90 * (corner - 2)) / corner); down();
    for(int i = 0; i < corner; i++){
      fd(a);
      rt(360 / corner);
    }
  }
  public void calcArea(int corner){
    s = (corner * a * r) / 2;
  }
  public void display(int corner){
    System.out.printf("%d角形, 面積 : %.4f, 外接円の半径 : %.4f\n", corner, s, r);
  }

}
