import java.awt.*;  
import java.awt.event.*;  
import java.util.*; 
import javax.swing.*; 
  
class a extends JFrame implements MouseListener {  
  
    TextField t;  
  
    Random rand = new Random();  
  
    public a() {  
        setLayout(new FlowLayout());  
        t = new TextField(10);  
        add(t);  
        t.addMouseListener(this);  
        setTitle("Catch The Textfield");  
        getContentPane().setBackground(Color.pink);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
    public void mouseEntered(MouseEvent e) {  
         
    }  
    public void mouseExited(MouseEvent e) {}  
    public void mouseClicked(MouseEvent e) {
t.setBounds(rand.nextInt(400), rand.nextInt(400), 90, 20); }  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {}  
}  
class Mouse {  
  
    public static void main(String arg[]) {  
        a f = new a();  
        f.setSize(400, 400);  
        f.setVisible(true);  
    }  
}  