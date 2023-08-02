import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KeyEx1 extends KeyAdapter
{
Label label1, label2;
TextField field1;
JFrame jf;
String str;


KeyEx1()
{

jf = new JFrame("Handling KeyEvent");

label1= new Label("Press any key on keyboad, to see the events it generates -", Label.CENTER);
label2= new Label();


field1 = new TextField(20); //calling TextField(String)

jf.setLayout(new FlowLayout());

jf.add(label1);
jf.add(field1);
jf.add(label2);


field1.addKeyListener(this); //As soon as button is clicked, data from all the textfields is read

jf.setSize(360,200);
jf.setVisible(true);
}


public void keyPressed(KeyEvent ke)
{
str= "KeyCode : " + ke.getKeyCode() + ",  -Key Pressed- ";
label2.setText(str);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void keyReleased(KeyEvent ke)
{
str+=" -Key Released- ";
label2.setText(str);
jf.setVisible(true);
str="";
}

public void keyTyped(KeyEvent ke)
{
str=" -Key Typed- "+ke.getKeyChar();
label2.setText(str);
jf.setVisible(true);
}

public static void main(String... ar)
{
new KeyEx1();
}

}