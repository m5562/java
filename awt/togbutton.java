import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;  
 
  
public class togbutton extends JFrame implements ActionListener {  
    public static void main(String[] args) {  
        new togbutton();  
    }  
    JToggleButton button;  
    togbutton() {  
        
        setLayout(new FlowLayout());  
        button = new JToggleButton("ON");
        add(button);    
        setSize(200, 200);  
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        button.addActionListener(this);   
    }  
   
    public void actionPerformed(ActionEvent eve) {  
        if (button.isSelected())  
            button.setText("OFF");  
        else  
            button.setText("ON");  
    }  
}  