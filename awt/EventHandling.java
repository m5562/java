import java.awt.*;
import java.awt.event.*;
class EventHandling extends Frame implements ActionListener,WindowListener
{
    TextField textField;
    EventHandling ()
    {
        textField = new TextField ();
        textField.setBounds (60, 50, 170, 20);
        Button button = new Button ("Show");
        button.setBounds (90, 140, 75, 40);
        button.addActionListener (this);
        add (button);
        add (textField);
        setSize (250, 250);
        setLayout (null);
        setVisible (true);
        addWindowListener(this);
    }
    public void actionPerformed (ActionEvent e)
    {
        textField.setText ("Hello World");
    }
  
 public void windowOpened(WindowEvent e){System.out.println("opened");}

 public void windowClosed(WindowEvent e){System.out.println("closed");}

 public void windowClosing(WindowEvent e){System.exit(0);
   System.out.println("closed");}

 public void windowActivated(WindowEvent e){}

 public void windowDeactivated(WindowEvent e){}
 public void windowIconified(WindowEvent e){}

 public void windowDeiconified(WindowEvent e){}


    public static void main (String args[])
    {
        new EventHandling ();
    }
}
