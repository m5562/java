import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo
{
    public static void main (String[]args)
    {
        JFrame f1 = new JFrame ();
        f1.setSize (300, 300);
        GridLayout ob = new GridLayout (2, 2);
        f1.setLayout (ob);
        JPanel p1 = new JPanel ();
        Label l1 = new Label ("Enter name");
        TextField tf = new TextField (10);
        Button b1 = new Button ("Submit");
        p1.add (l1);
        p1.add (tf);
        p1.add (b1);
        p1.setBackground(Color.orange);
        f1.add (p1);
        Panel p2 = new Panel ();
	Button b2 = new Button ("Cancel");
        p2.add(b2);
   p2.setBackground(Color.blue);
        f1.add (p2);
        Panel p3 = new Panel ();
         Button b3 = new Button ("Reset");
        p3.add(b3);
p3.setBackground(Color.red);
        f1.add (p3);
        Label l2 = new Label ("Welcome to Java");
        f1.add (l2);
//give color to a frame
 f1.getContentPane().setBackground(Color.cyan);
        f1.setVisible (true);
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}