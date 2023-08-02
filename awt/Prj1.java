import java.awt.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Prj1 extends JFrame  {
JButton b;

    public Prj1() {
         b=new JButton("click here");
         setSize(300,300);
         setLayout(null);
         b.setBounds(100,150,100,20);
         add(b);
         setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Prj1();
    }
    
}