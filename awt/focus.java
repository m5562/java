import java.awt.*;
import java.awt.event.*;
class focus extends Frame 
{
 TextField t1=new TextField(25);
TextField t2=new TextField(25);
 focus()
 {
  

  add(t1);add(t2);
  setLayout(new FlowLayout());
  setSize(500,500);
 
 setVisible(true);
  t1.addFocusListener(new FocusListener(){
public void focusGained(FocusEvent e)
{
 
     t1.setText("t1 got focus");
 
}
public void focusLost(FocusEvent e){}});
  
t2.addFocusListener(new FocusListener(){
public void focusGained(FocusEvent e)
{
 
     t2.setText("t2 got focus");
 
}
public void focusLost(FocusEvent e){}});


 }
 
public static void main(String[] s)
{
 new focus();
}
}