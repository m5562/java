import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class testev1 extends JFrame implements ActionListener
{
JTextField t;
JButton b1,b2;
testev1()
{
 t=new JTextField(25);
 b1=new JButton("OK");
 b2=new JButton("Cancel");
 add(t);add(b1);add(b2);
 setSize(300,200);
 setVisible(true);
 setLayout(new FlowLayout());
 b1.addActionListener(this);
 b2.addActionListener(this);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
}
public void actionPerformed(ActionEvent e)
{ 
 if(e.getActionCommand().equals("OK"))
 t.setText("ok");
 else if(e.getActionCommand().equals("Cancel"))
 t.setText(" ");
}
public static void main(String...s)
{
new testev1();
}

}