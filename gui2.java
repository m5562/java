import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui2 extends JFrame //implements ActionListener
{
  JTextField t;
  JButton b;
  gui2()
   {
    t=new JTextField(25);
    b=new JButton("click");
    add(t);add(b);
    setSize(400,200);
    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
  {  
   t.setBackground(Color.blue);
   Color c1=new Color(200,20,10);
   t.setForeground(Color.cyan);
   t.setText("welcome to cime event");

  }
});
   }

public static void main(String[] s)
  {
   new gui2();
  }
}
    
    