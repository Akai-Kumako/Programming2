import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class L22_1 extends JPanel implements ActionListener{
  JLabel label;
  JButton b1, b2;

  public L22_1(){
    label = new JLabel("");
    b1 = new JButton("ご挨拶");
    b2 = new JButton("消去");

    b1.addActionListener(this);
    b2.addActionListener(this);

    setLayout(new BorderLayout());
    add(label, BorderLayout.NORTH);
    add(b1, BorderLayout.CENTER);
    add(b2, BorderLayout.EAST);
  }

  public void actionPerformed(ActionEvent e){
    Object obj = e.getSource();
    if(obj == b1)
      label.setText("こんにちは");
    else if(obj == b2)
      label.setText("");
  }

  public static void main(String[] args){
    JFrame frame = new JFrame("L22_1");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    L22_1 h = new L22_1();
    frame.add (h, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}
