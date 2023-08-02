import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingShapes implements ActionListener
{
   int choice = 0;
   JButton square = new JButton("Square");
   JButton rectangle = new JButton("Rectangle");
   JButton circle = new JButton("Circle");
   Drawing draw = new Drawing();
   
   public DrawingShapes()
   {
      JFrame frame = new JFrame("Draw Shapes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      square.addActionListener(this);
      rectangle.addActionListener(this);
      circle.addActionListener(this);
      JPanel panel = new JPanel();
      panel.add(square);
      panel.add(rectangle);
      panel.add(circle);
      frame.add(panel, "North");
      frame.add(draw);
      frame.setSize(500,500);
      frame.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == square)
         choice = 1;
      else if (e.getSource() == rectangle)
         choice = 2;
      else 
         choice = 3;
      draw.repaint();
   }
   
   class Drawing extends JComponent
   {
      public void paint(Graphics g)
      {
         g.setColor(Color.red);
         if (choice == 1)
            g.fillRect(100,80,300,300);
         else if (choice == 2)
            g.fillRect(50,200,350,100);
         else if (choice == 3)
            g.fillOval(150,100,200,200);
      }
   }
   
   public static void main(String[] args)
   {
      new DrawingShapes();
   }
}  