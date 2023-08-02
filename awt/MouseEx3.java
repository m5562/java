import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
import javax.swing.*;

public class MouseEx3 extends WindowAdapter implements MouseMotionListener
{
Label label1, label2;
JFrame frame;
String str;
Point p;


MouseEx3()
{

frame = new JFrame("Window");

label1= new Label("Tracking mouse cursor in the Frame window", Label.CENTER);
label2= new Label();


frame.setLayout(new FlowLayout());
frame.add(label1);
frame.add(label2);



//Registering class MouseEx1 to catch and respond to mouse motion motion events 
frame.addMouseMotionListener(this);



//Registering class MouseEx3 to catch and respond to window event i.e. window closing event
frame.addWindowListener(this);


frame.setSize(280,200);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


//Method of WindowAdapter class to catch and respond to window closing event
public void windowClosing(WindowEvent we)
{
    System.exit(0);
}


//Method of MouseMotionListener interface
public void mouseDragged(MouseEvent me)
{
String s = me.getX() + "," + me.getY();
label2.setText("Mouse dragged "+ s);
frame.setVisible(true);
}


//Method of MouseMotionListener interface
public void mouseMoved(MouseEvent me)
{
String s = me.getX() + "," + me.getY();
label2.setText("Mouse moved "+ s);
frame.setVisible(true);
}



public static void main(String... ar)
{
new MouseEx3();
}

}