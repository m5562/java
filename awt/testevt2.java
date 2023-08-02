import java.awt.*;
import java.awt.event.*;
public class testevt2 extends Frame 
{
public Button b1;
 public Label l1;
 TextField t=new TextField("hello");
public testevt2()
 {
  
  b1=new Button("click");
  l1=new Label();
 setLayout(null);
l1.setBounds(200,70,100,20);
b1.setBounds(20,50,100,20);
t.setBounds(200,50,100,30);
  add(l1);
  add(b1);
  add(t);
t.addTextListener(new TextListener(){
public void textValueChanged(TextEvent e){t.setText("hi");}});
  b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
 l1.setText(t.getSelectedText());
l1.setBackground(Color.BLUE);
}
});
  setSize(400,500);
  setVisible(true);
  l1.setSize(100,20);
  }


public static void main(String[] s)
{
 new testevt2();
}
} 
