import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class WindowEx1 implements WindowListener
{
Label label1;
Frame frame;


WindowEx1()
{

frame = new Frame("Handling KeyEvent");

label1= new Label("-See window events -", Label.CENTER);

frame.setLayout(new FlowLayout());
frame.add(label1);

//Registering class WindowEx1 to catch and respond to window events 
frame.addWindowListener(this); 

frame.setSize(340,200);
frame.setVisible(true);
}


public void windowActivated(WindowEvent we)
{
System.out.println("Window Activated");
}

public void windowClosed(WindowEvent we)
{
System.out.println("Window Closed");
}

public void windowClosing(WindowEvent we)
{
frame.dispose();
System.out.println("Window Closing");
}

public void windowDeactivated(WindowEvent we)
{
System.out.println("Window Deactivated");
}

public void windowDeiconified(WindowEvent we)
{
System.out.println("Window Deiconified");
}

public void windowIconified(WindowEvent we)
{
System.out.println("Window Iconified/minimized");
}

public void windowOpened(WindowEvent e)
{
System.out.println("Window Opened for the first time");
}

public static void main(String... ar)
{
new WindowEx1();
}

}