  
import java.awt.*;  

import javax.swing.*;  
  
public class toolbar {  
    public static void main(final String s[]) {  
        JFrame f = new JFrame("JToolBar Example");  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        JToolBar toolbar = new JToolBar();  
        toolbar.setRollover(true);  
        JButton button = new JButton("File");  
        toolbar.add(button);  
        toolbar.addSeparator();  
        toolbar.add(new JButton("Edit"));  
        toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" }));  
        
        f.add(toolbar, BorderLayout.NORTH);  
        
        
        f.setSize(450, 250);  
        f.setVisible(true);  
    }  
}  