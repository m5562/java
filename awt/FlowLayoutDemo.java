import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo
{
    JFrame f;
    FlowLayoutDemo ()
    {
        f = new JFrame ();
        JLabel l1 = new JLabel ("Enter Name");
        JTextField tf1 = new JTextField (10);
        JButton b1 = new JButton ("click here");
        f.add (l1);
        f.add (tf1);
        f.add (b1);
        f.setLayout (new FlowLayout (FlowLayout.RIGHT,20,20));
        //f.setLayout (new FlowLayout ());
        
        //setting flow layout of right alignment  
        f.setSize (300, 300);
        f.setVisible (true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String[]args)
    {
        new FlowLayoutDemo ();
    }
}