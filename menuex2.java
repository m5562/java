import java.awt.*;
import java.awt.event.*;
class menuex2 extends Frame 
{
  MenuBar mb;
  Menu f;
  MenuItem m1,m2;
 menuex2()
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
  m1.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e){
 			System.out.println("new is clicked");}
                        });
  m2.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e)
			{ System.exit(0);}
 			});
 }


public static void main(String...s)
{
 new menuex2();
}
}

  