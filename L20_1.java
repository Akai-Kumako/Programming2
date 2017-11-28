import java.awt.*;
import javax.swing.*;
import java.util.*;

class L20_1 extends JPanel{
  L20_1(int backGround[]){

    Color colors[] = {Color.blue, Color.cyan, Color.green, Color.gray, Color.orange, Color.red, Color.yellow};
    JButton button1 = new JButton("ボタン1");    
    JButton button2 = new JButton("ボタン2");    
    JButton button3 = new JButton("ボタン3");    
    JButton button4 = new JButton("ボタン4");    
    JButton button5 = new JButton("ボタン5");    
    JButton button6 = new JButton("ボタン6");    
    JButton button7 = new JButton("ボタン7");    
    JButton button8 = new JButton("ボタン8");    

    JPanel pA = new JPanel();
    pA.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    pA.setBackground(colors[backGround[0]]);
    pA.add(button1);
    button1.setBackground(colors[backGround[1]]);
    button1.setOpaque(true);
    pA.add(button2);
    button2.setBackground(colors[backGround[1]]);
    button2.setOpaque(true);
    pA.add(button3);
    button3.setBackground(colors[backGround[1]]);
    button3.setOpaque(true);

    JPanel pB = new JPanel();
    pB.setLayout(new GridLayout(2, 0));
    pB.setBackground(colors[backGround[2]]);
    pB.add(new JCheckBox("チェック1"));
    pB.add(new JCheckBox("チェック2"));
    pB.add(new JCheckBox("チェックA"));
    pB.add(new JCheckBox("チェックB"));

    JPanel pC = new JPanel();
    pC.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    pC.setBackground(colors[backGround[3]]);
    pC.add(button6);
    button6.setBackground(colors[backGround[4]]);
    button6.setOpaque(true);
    pC.add(button7);
    button7.setBackground(colors[backGround[4]]);
    button7.setOpaque(true);    
    pC.add(button8);
    button8.setBackground(colors[backGround[4]]);
    button8.setOpaque(true);    

    JPanel p1 = new JPanel();
    p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
    p1.add(pA);
    p1.add(pB);

    JPanel p2 = new JPanel();
    p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
    p2.setBackground(colors[backGround[6]]);
    p2.add(button4);
    button4.setBackground(colors[backGround[5]]);
    p2.add(button5);
    button5.setBackground(colors[backGround[5]]);
    p2.add(pC);
    
    JPanel p = new JPanel();
    p.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    p.add(p1);
    p.add(p2);

    add(p);

  }

  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0 ; i < 7 ; i++) {
      list.add(i);
    }
    Collections.shuffle(list);
    int backGround[] = new int[7];    

    for(int i = 0; i < 7; i++){
      backGround[i] = list.get(i);
      System.out.println(backGround[i]);
    } 

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    L20_1 a = new L20_1(backGround);
    frame.add(a, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
   
  }
}
