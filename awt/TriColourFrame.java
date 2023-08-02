import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TriColourFrame implements ActionListener
{
   JButton redButton = new JButton("red");
   JButton greenButton = new JButton("green");
   JButton blueButton = new JButton("blue");
   JFrame frame = new JFrame("Tricolour Buttons");
   
   public TriColourFrame ()
   {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      redButton.addActionListener(this);
      greenButton.addActionListener(this);
      blueButton.addActionListener(this);
      frame.setLayout(new FlowLayout());
      frame.add(redButton);
      frame.add(greenButton);
      frame.add(blueButton);
      frame.setSize(300,100);
      frame.setVisible(true);
   }

   public void actionPerformed (ActionEvent e)
   {
      if (e.getSource() == redButton)
         frame.getContentPane().setBackground(Color.red);
      else if (e.getSource() == greenButton)
         frame.getContentPane().setBackground(Color.green);
      else if (e.getSource() == blueButton)
         frame.getContentPane().setBackground(Color.blue);
      else
         frame.getContentPane().setBackground(Color.black);
   }
   
   public static void main(String[] args)
   {
      new TriColourFrame();
   }
} 