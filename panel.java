import javax.swing.*;
import java.awt.*;
class panel extends JFrame {

  panel()
    {
     JPanel p=new JPanel();
        JButton b=new JButton("JFrameButton");//create instance of JButton
        b.setBounds(100,50,150,40);//dimensions of JButton object
        add(p);
        p.add(b);//add button in JFrame
        setSize(300,200);
        p.setSize(200,100);//set frame width = 300 and height = 200
        p.setLayout(null);//no layout manager specified
        setVisible(true);//make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color c1=new Color(123,100,167);
        p.setBackground(c1);
Choice c=new Choice();
c.setBounds(100,100, 75,75);
c.add("Subject 1");
c.add("Subject 2");
c.add("Subject 3");
c.add("Subject 4");
c.add("Subject 5");
p.add(c);
c.setBounds(100,120,100,40);

      }
 
    public static void main(String[] args) {
        panel f=new panel();
    }
}

