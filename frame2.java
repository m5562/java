import java.awt.*;
import javax.swing.*;
class frame2 extends JFrame
{
 JLabel l1,l2,l3;
 JTextField t1,t2;
 JButton b;
 frame2()
 {
  l1=new JLabel("Log In");
  l2=new JLabel("user");
l3=new JLabel("password");
 t1=new JTextField(25);
 t2=new JTextField(25);
 b=new JButton("Sign In");
add(l1);add(l2);add(t1);
add(l3);add(t2);add(b);
setSize(500,500);
setVisible(true);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] s)
{
 frame2 f=new frame2();
}
}


  
