import java.awt.*;
import java.awt.event.*;
class gui8 extends Frame implements WindowListener,ActionListener
{
  TextField t,t1;
   Button b;
  gui8()
  {
   t=new TextField("cime            ");
   t1=new TextField(25);
   b=new Button("click");
   add(t);
   add(b);
   add(t1);
  setLayout(new FlowLayout(FlowLayout.RIGHT));
  setSize(300,200);
  
setVisible(true);
 b.addActionListener(this);
 addWindowListener(this);
 }


public void actionPerformed(ActionEvent e)
{
t1.setBackground(Color.green);
t.setBackground(Color.cyan);
  
t1.setText(t.getText());
 t.setText("welcome to event program");
  
}


public void windowOpened(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}

public void windowClosing(WindowEvent e){System.exit(0);}
public static void main(String[] s)
{
new gui8();
}
}