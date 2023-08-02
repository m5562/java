import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;


public class MenuEx2 implements ActionListener
{
JFrame frame;
JMenuBar menuBar;
JMenu menu1, menu2; 
JMenuItem mItem1, mItem2, mItem3, mItem4, mItem5, mItem6, mItem7;
FileDialog fg;
JLabel label1;

MenuEx2()
{
frame = new JFrame("JDialog");

//Creating a menu bar
menuBar= new 	JMenuBar();


//Creating first menu
menu1 = new JMenu("File");
mItem1 = new JMenuItem("New");
mItem2 = new JMenuItem("Open");
mItem3= new JMenuItem("Save");
mItem4 = new JMenuItem("Exit");


//Adding menu items to the  menu
menu1.add(mItem1);
menu1.add(mItem2);
menu1.add(mItem3);
menu1.add(mItem4);


//Creating a second sub-menu
menu2 = new JMenu("Save-as");
mItem5 = new JMenuItem(".jpeg");
mItem6 = new JMenuItem(".png");
mItem7 = new JMenuItem(".pdf");

//Adding menu items to the sub-menu
menu2.add(mItem5);
menu2.add(mItem6);
menu2.add(mItem7);

//Adding the sub-menu to the first menu
menu1.add(menu2);

//Adding the exit menu item at the last of menu
menu1.add(mItem4);


//Adding our menu  to the menu bar
menuBar.add(menu1);

//Adding listener to "Open" and "Exit" menu items
mItem2.addActionListener(this);
mItem4.addActionListener(this);

label1 = new JLabel();

frame.setJMenuBar(menuBar);
	JToolBar toolbar = new JToolBar();  
        toolbar.setRollover(true);  
        JButton button = new JButton("File");  
        toolbar.add(button);  
        toolbar.addSeparator();  
        toolbar.add(new JButton("Edit"));  
        toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" }));  
        
        frame.add(toolbar, BorderLayout.NORTH);  
frame.add(label1,BorderLayout.CENTER);
frame.setSize(370,270);
frame.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand().equals("Open"))
{

	//Creating an object of FileDialog
	fg = new FileDialog(frame, "Open a file");
	fg.setVisible(true);
	String file = fg.getDirectory()+ fg.getFile();
	label1.setText("File to Open - " + file);
}


if(ae.getActionCommand().equals("Exit"))
{
System.exit(0);
}
}

public static void main(String... ar)
{
new MenuEx2();
}

}