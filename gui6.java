import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class gui6 extends JFrame
{
 TextField t;
gui6()
 {
  t=new TextField(25);
  add(t);
  setLayout(new FlowLayout(FlowLayout.CENTER));
  setSize(300,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  addMouseListener(new MouseAdapter(){

 
public void mouseClicked(MouseEvent e){
int x=e.getX();
int y=e.getY();
t.setText(x+","+y); 
}
 
});
}
public static void main(String[] s){
new gui6();
}
}




