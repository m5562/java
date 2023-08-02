import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ev1 extends JFrame implements ActionListener
{
TextField textField;
ev1()
    {
textField = new TextField ("color demo");
textField.setBounds (60, 50, 170, 20);
        Button button = new Button ("Show");
button.setBounds (90, 140, 75, 40);
button.addActionListener (this);
add (button);
add (textField);
textField.setBackground(Color.green);
textField.setForeground(Color.blue);


setSize (250, 250);
setLayout (null);
setVisible (true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
public void actionPerformed (ActionEvent e)
    {
textField.setBackground(Color.red);
textField.setText ("Hello World");
    }
public static void main (String args[])
    {
new ev1 ();
    }
}
