import java.awt.*;
import java.awt.event.*;
public class testevt1 extends Frame 
{
public Button b1;
 public Label l1;
public testevt1()
 {
  
  b1=new Button("click");
  l1=new Label();
 setLayout(null);
l1.setBounds(20,20,100,20);
b1.setBounds(20,50,100,20);
  add(l1);
  add(b1);
  b1.addActionListener(new list1(this));
  setSize(400,500);
  setVisible(true);
  l1.setSize(100,20);
  }


public static void main(String[] s)
{
 new testevt1();
}
} 
class list1 implements ActionListener
{ 
testevt1 t;
list1(testevt1 t)
{
 this.t=t;
}
public void actionPerformed(ActionEvent e)
{
 t.l1.setText("you have clicked the button");
t.l1.setBackground(Color.BLUE);
}
}