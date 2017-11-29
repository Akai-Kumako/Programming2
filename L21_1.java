import java.awt.*;
import javax.swing.*;

public class L21_1 extends JPanel{
  public L21_1(){
    setBackground(Color.white);
    setPreferredSize(new Dimension(400, 400));
  }
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    int[] xPoints = {230, 230, 300, 370, 370, 300};
    int[] yPoints = {120, 200, 240, 200, 120, 80};
    g.setColor(Color.green);
    g.setFont(new Font("Serif", Font.PLAIN, 25));
    g.drawRect(10, 100, 50, 80);
    g.drawString("長方形", 1, 200);
    g.setColor(Color.red);
    g.setFont(new Font("Hiragino Kaku Gothic Pro", Font.PLAIN, 15));
    g.drawLine(70, 70, 220, 220);
    g.drawLine(220, 70, 70, 220);
    g.drawString("直線", 120, 200);
    g.setColor(Color.blue);
    g.setFont(new Font("Hiragino Kaku Gothic ProN", Font.PLAIN, 20));
    g.drawOval(110, 220, 80, 140); 
    g.drawString("楕円", 190, 350);
    g.setColor(Color.black);
    g.setFont(new Font("Hiragino Maru Gothic Pro", Font.ITALIC, 25));
    g.drawPolygon(xPoints, yPoints, 6);
    g.drawString("六角形", 280, 265);
  }
  public static void main(String[] args){
    JFrame frame = new JFrame("Draw Line");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    L21_1 h = new L21_1();
    frame.add(h, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}
