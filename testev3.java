import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class testev3 extends JFrame implements TextListener
{
JTextField t;
testev3()
{
 t=new JTextField(25);
 
 add(t);
 setSize(300,200);
 setVisible(true);
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 t.addTextListener(this);
  
}

public void textValueChanged(TextEvent e)
{
 t.setText("hi");
}
public static void main(String...s)
{
new testev3();
}

}