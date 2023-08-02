import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ItemEx1 implements ItemListener
{
JFrame jf;
Checkbox chk1, chk2;
Label label1;


ItemEx1()
{
	jf= new JFrame("Checkbox");
	chk1 = new Checkbox("Happy");
	chk2 = new Checkbox("Sad");
	label1 = new Label();

	jf.add(chk1);
	jf.add(chk2);

	chk1.addItemListener(this);
	chk2.addItemListener(this);

	jf.setLayout(new FlowLayout());	
	jf.setSize(220,150);
	jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void itemStateChanged(ItemEvent ie)
{
	Checkbox ch =(Checkbox)ie.getItemSelectable();
	if(ch.getState()==true)
	{
                System.out.println(ch.getLabel()+ " is checked");
		label1.setText(ch.getLabel()+ " is checked");
		jf.add(label1);
		jf.setVisible(true);
	}
	else
	{
		label1.setText(ch.getLabel()+ " is unchecked");
		jf.add(label1);
		jf.setVisible(true);
	}
}

public static void main(String... ar)
{
	new ItemEx1();
}

}
