import java.awt.*;
import javax.swing.*;

public class L19_2 extends JPanel{
  JLabel label;
  JButton greet, remove;
  ImageIcon iconGreet = new ImageIcon("忍者.png");
  ImageIcon iconRemove = new ImageIcon("ドロン.png"); 

  public L19_2(){
    label = new JLabel("こんにちは");
    greet = new JButton("あいさつ", iconGreet);
    remove = new JButton("消える", iconRemove);
    setLayout(new BorderLayout());
    add(label, BorderLayout.NORTH);
    add(greet, BorderLayout.WEST);
    add(remove, BorderLayout.EAST);
  }
  public static void main(String[] args){
    JFrame frame = new JFrame("Hello");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    L19_2 h = new L19_2();
    frame.add(h, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}
