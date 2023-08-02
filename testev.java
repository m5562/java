import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class testev extends JFrame
{
JTextField t;
JButton b;

testev()
{
  t=new JTextField(25);
  b=new JButton("click");
add(t);
add(b);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(200,200);
setVisible(true);
clickev action=new clickev(this);
b.addActionListener(action);
}
public static void main(String[] s)
{
new testev();
}
}

class clickev implements ActionListener
{
testev o;
clickev(testev o)
{
this.o=o;
}
public void actionPerformed(ActionEvent e)
{
o.t.setText("CIME");

}
} 

