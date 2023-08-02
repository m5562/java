import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class testev2 extends JFrame 
{
JTextField t;
JButton b1,b2;
testev2()
{
 t=new JTextField(25);
 b1=new JButton("OK");
 b2=new JButton("Cancel");
 add(t);add(b1);add(b2);
 setSize(300,200);
 setVisible(true);
 setLayout(new FlowLayout());
 b1.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent e)
{ 
  t.setText("ok");}});
 b2.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent e)
{ 
  t.setText("");}});
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
}

 
 

public static void main(String...s)
{
new testev2();
}

}