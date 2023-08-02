import java.awt.*;
import java.awt.event.*;

// Mu khali WindowAdapter use karichhi
// tu chahinle MouseAdapter b use kari paribu

public class happy extends Frame implements MouseListener {
    Button b1, b2;
    TextField t;

    happy() {
        addMouseListener(this);
        b1 = new Button("First Button.");
        b2 = new Button("Second Button.");
        t = new TextField(30);
        b1.setBounds(40, 100, 100, 30);
        b2.setBounds(50, 150, 100, 30);
        add(b1);
        add(b2);
        add(t);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // System.exit(0) bi chaliba
            }
        });
    }

    public void mouseClicked(MouseEvent e) {
        t.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        t.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        t.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        t.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        t.setText("Mouse Released");
    }

    public static void main(String args[]) {
        new happy();
    }
}