import java.awt.*;
import java.awt.event.*;
public class border extends Frame
{
Button bnorth, bsouth, beast, bwest, bcenter;
border()
{
setSize(400, 200);
setTitle("My Application");
bnorth = new Button("North");
bsouth = new Button("South");
beast = new Button("East");
bwest = new Button("West"); 
bcenter = new Button("Center");
add(bnorth, BorderLayout.NORTH);
add(bsouth, BorderLayout.SOUTH);
add(beast, BorderLayout.EAST);
add(bwest, BorderLayout.WEST);
add(bcenter, BorderLayout.CENTER);

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
border mf = new border();
}
}