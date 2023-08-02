import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

 

class ItemE extends JFrame implements ItemListener{


    JTextArea txtarea; 
    JComboBox Ccountry; 
    public ItemE(){ 
    super("ComboBox Event"); 
    JPanel panel;
    
    String[] counlist={"Cambodia","China","India","South Korea","USA"}; 
    setLayout(null);/*setting the layout of displaying controls to null 
  will enable you to specify the locations of your controls to display */

  
  Ccountry=new JComboBox(counlist); 
  txtarea=new JTextArea(10,10); 
  Ccountry.addItemListener(this); 
  panel=new JPanel(); 
  panel.add(Ccountry); 
  panel.add(txtarea);

  
  panel.setBounds(20,40,100,100); 
  add(panel); 
  addWindowListener(new Listener()); 
  pack(); 
  setSize(500,500); 
  setVisible(true);

}

 

public void itemStateChanged(ItemEvent e){


      JComboBox jc=(JComboBox)e.getSource(); 
      txtarea.append("     "+jc.getSelectedItem()+"\n"); //use getSelectedItem to get the text of selected item of the combobox 
  }
class Listener extends WindowAdapter{


      public void windowClosing(WindowEvent e){System.exit(0);} 
}
 


}
public class ItemEventTest{


  public static void main(String[] args){ 
    new ItemE(); 
}
   
} 
