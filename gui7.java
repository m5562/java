import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class gui7 extends WindowAdapter
{
 TextField t;
 JFrame f=new JFrame();
gui7()
 {
  t=new TextField(25);
  f.add(t);
  f.setLayout(new FlowLayout(FlowLayout.CENTER));
  f.setSize(300,200);
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  g g1=new g();
  f.addWindowListener(g1);
}

 


public static void main(String[] s){
new gui7();
}
}
class g extends WindowAdapter
{
public void windowClosing(WindowEvent e){
System.exit(0);
}
}



