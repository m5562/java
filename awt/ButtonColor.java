import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonColor implements ActionListener
{
   JButton colourButton = new JButton("Change Colour");
   
   public ButtonColor()
   {
      JFrame frame = new JFrame("Button Events");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 100);
      colourButton.addActionListener(this);
      frame.setLayout(new FlowLayout());
      frame.add(colourButton);
      frame.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      colourButton.setBackground(new Color(strength(), strength(), strength()));
   }
   
   public static int strength()
   {
      return (int)(256 * Math.random());
   }
   
   public static void main(String[] args)
   {
      new ButtonColor();
   }
} 