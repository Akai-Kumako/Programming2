import java.awt.*;
import javax.swing.*;

public class L19_1 extends JPanel{
  JButton north, west, center, east, south;

  public L19_1(){
    north = new JButton("北");
    west = new JButton("西");
    center = new JButton("中央");
    east = new JButton("東");
    south = new JButton("南");
    setLayout(new BorderLayout());
    add(north, BorderLayout.NORTH);
    add(west, BorderLayout.WEST);
    add(center, BorderLayout.CENTER);
    add(east, BorderLayout.EAST);
    add(south, BorderLayout.SOUTH);
  }
  public static void main(String[] args){
    JFrame frame = new JFrame("Hello");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    L19_1 h = new L19_1();
    frame.add(h, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}
