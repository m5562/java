import java.awt.*;
import javax.swing.*;
class myframe1 extends JFrame
{
 JLabel l1,l2,l3;
 JTextField t1,t2;
 JButton b;
 myframe1()
 {
  l1=new JLabel("log in");
  l2=new JLabel("user name");
l3=new JLabel("password");
t1=new JTextField(25);
t2=new JTextField(25);
b=new JButton("sign in");
add(l1);
add(l2);
add(t1);
add(l3);
add(t2);
add(b);
setLayout(new GridLayout(3,2));
setSize(500,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] s)
{
  myframe1 f=new myframe1();
}
}

   