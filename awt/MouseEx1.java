import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MouseEx1 implements MouseListener
{
Label label1, label2;
JFrame frame;
String str;

MouseEx1()
{
frame = new JFrame();
label1= new Label("Handling mouse events in the Frame window", Label.CENTER);
label2= new Label();


frame.setLayout(new FlowLayout());
frame.add(label1);
frame.add(label2);

//Registering class MouseEx1 to catch and respond to mouse events 
frame.addMouseListener(this); 

frame.setSize(340,200);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


public void mouseClicked(MouseEvent we)
{
str+=" and Mouse button was clicked at "+we.getX()+","+we.getY();
label2.setText(str);
frame.setVisible(true);
}

public void mouseEntered(MouseEvent we)
{
label2.setText("Mouse has entered the window area");
frame.setVisible(true);
}

public void mouseExited(MouseEvent we)
{
label2.setText("Mouse has exited the window area");
frame.setVisible(true);
}


public void mousePressed(MouseEvent we)
{
label2.setText("Mouse button is being pressed");
frame.setVisible(true);
}

public void mouseReleased(MouseEvent we)
{
str="Mouse button is released";
label2.setText(str);
frame.setVisible(true);
}


public static void main(String... ar)
{
new MouseEx1();
}

}
