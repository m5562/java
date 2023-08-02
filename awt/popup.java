import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class popup extends JFrame implements ActionListener
{
 JPopupMenu jp;
 JButton b;
 JMenuItem m1,m2;
 JPanel p;
 popup()
 {
  jp=new JPopupMenu("edit");
  b=new JButton("menu");
  m1=new JMenuItem("color");
  m2=new JMenuItem("font");
  p=new JPanel();
  p.add(b);
  jp.add(m1);
  jp.add(m2);
add(p);
  p.setBounds(10,10,200,200);
  b.setBounds(10,100,80,20);
  b.addActionListener(this);
  m1.addActionListener(this);
  setSize(300,300);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent ae)
 { 
   
   if(ae.getActionCommand().equals("menu"))
   jp.show(b,b.getWidth()/2,b.getHeight()/2);
   else if(ae.getActionCommand().equals("color"))
    p.setBackground(Color.red);
   
 }
public static void main(String[] s)
{
 new popup();
}
}
 
 