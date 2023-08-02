
import java.awt.*;
import java.awt.event.*;
public class grid extends Frame
{
Button b1, b2, b3, b4;
grid()
{
setSize(300, 300);
setTitle("My Application");
setLayout(new GridLayout(2, 2,20,20));
b1 = new Button("1");
b2 = new Button("2");
b3 = new Button("3");
b4 = new Button("4");
add(b1);
add(b2);
add(b3);
add(b4);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}
);
setVisible(true);
}

public static void main(String[] args)
{
grid mf = new grid();
}
}