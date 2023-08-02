import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class panel extends JFrame 
{
 JPanel p1,p2;
 JButton b1,b2;
 panel()
 {
  p1=new JPanel();
  b1=new JButton("panel1");
  p1.add(b1);
  p2=new JPanel();
  b2=new JButton("panel2");
  p2.add(b2);
  add(p1);
  add(p2);
  setLayout(new FlowLayout());
  setSize(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  b1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e)
{
 p1.setVisible(false);}});
 b2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e)
{
 p2.setVisible(false);}});
 }
public static void main(String[] s)
{
 new panel();
}
}

 
