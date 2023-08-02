import java.awt.event.WindowAdapter;  
import java.awt.Frame;  
import java.awt.event.WindowEvent;  
public class Windadap extends Frame  
{  
    public Windadap()  
    {  
        WindowAdapterClose clsme = new WindowAdapterClose();  
        addWindowListener(clsme);  
        setTitle("WindowAdapter frame closing");  
        setSize(400, 400);  
        setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new Windadap();  
    }  
}  
class WindowAdapterClose extends WindowAdapter  
{  
    public void windowClosing(WindowEvent e)  
    {  
        System.exit(0);  
    }  
}   
