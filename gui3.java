import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui3 extends JFrame implements WindowListener
{
  JTextField t;
  JButton b;
  gui3()
   {
    t=new JTextField(25);
    b=new JButton("click");
    add(t);add(b);
    setSize(400,200);
    setLayout(new FlowLayout());
    setVisible(true);
   // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e)
  {  
   t.setBackground(Color.blue);
   Color c1=new Color(200,20,10);
   t.setForeground(Color.cyan);
   t.setText("welcome to cime event");

  }
});

addWindowListener(this);

   }
public void windowOpened(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowClosing(WindowEvent e){System.exit(0);}
public void windowIconified(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}

public void windowDeiconified(WindowEvent e){}








public static void main(String[] s)
  {
   new gui3();
  }
}
    
    