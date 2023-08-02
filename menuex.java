import java.awt.*;
import java.awt.event.*;
class menuex extends Frame implements ActionListener
{
  MenuBar mb;
  Menu f;
  MenuItem m1,m2;
 menuex()
 {
  mb=new MenuBar();
  f=new Menu("File");
  m1=new MenuItem("new");
  m2=new MenuItem("close");
  setMenuBar(mb);
  mb.add(f);
  f.add(m1);
  f.add(m2);
  setSize(300,200);
  setLayout(new FlowLayout());
  setVisible(true);
  m1.addActionListener(this);
  m2.addActionListener(this);
 }
public void actionPerformed(ActionEvent e){
if(e.getActionCommand()=="new")
 System.out.println("new is clicked");
else if(e.getActionCommand()=="close")
System.exit(0);}
public static void main(String...s)
{
 new menuex();
}
}

  