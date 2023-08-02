import javax.swing.*;
import java.awt.*;
class myframe2 {
 
    public static void main(String[] args) {
        JFrame f=new JFrame("JFrameInstanceExample");//create a JFrame object
        JPanel p=new JPanel();
        JButton b=new JButton("JFrameButton");//create instance of JButton
        b.setBounds(100,50,150,40);//dimensions of JButton object
        f.add(p);
        p.add(b);//add button in JFrame
        f.setSize(300,200);
        p.setSize(200,100);//set frame width = 300 and height = 200
        p.setLayout(null);//no layout manager specified
        f.setVisible(true);//make the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBackground(Color.red);
    }
}

