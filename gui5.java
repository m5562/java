import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class gui5 extends JFrame
{
 TextField t;
gui5()
 {
  t=new TextField(25);
  add(t);
  setLayout(new FlowLayout(FlowLayout.CENTER));
  setSize(300,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  addMouseListener(new MouseListener(){
public void mouseEntered(MouseEvent e){}
 public void mouseExited(MouseEvent e){}
 
public void mouseClicked(MouseEvent e){
int x=e.getX();
int y=e.getY();
t.setText(x+","+y); 
}
 
public void mousePressed(MouseEvent e){}
 
public void mouseReleased(MouseEvent e){}
 
});
}
public static void main(String[] s){
new gui5();
}
}




