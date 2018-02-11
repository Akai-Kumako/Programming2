import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class L221 extends JPanel implements ActionListener{
  JLabel label;
  JButton b1, b2, b3;

  public L221(){
    label = new JLabel("     ");
    b1 = new JButton("グー");
    b2 = new JButton("チョキ");
    b3 = new JButton("パー");

    label.setHorizontalAlignment(JLabel.CENTER);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(200, 100));
    add(label, BorderLayout.SOUTH);
    add(b1, BorderLayout.WEST);
    add(b2, BorderLayout.CENTER);
    add(b3, BorderLayout.EAST);

  }

  public void actionPerformed(ActionEvent e){
    Object obj = e.getSource();
    // 0:グー, 1:チョキ, 2:パー
    int p1 = -1; 
    int p2 = (int)(Math.random() * 3);
    if(obj == b1){
      p1 = 0;
    }else if(obj == b2){
      p1 = 1;
    }else{
      p1 = 2;
    }
    if(p1 == p2){
      label.setText("あいこ");
    }else if(p1 - p2 == -1 || p1 - p2 == 2){
      label.setText("あなたの勝ち");
    }else{
      label.setText("あなたの負け");
    }
  }

  public static void main(String[] args){
    JFrame frame = new JFrame("L221");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    L221 h = new L221();
    frame.add (h, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}
