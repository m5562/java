import java.awt.event.WindowAdapter;

import java.awt.Frame;

import java.awt.event.*;

public class KeyAdapterEx extends Frame

  {

    public KeyAdapterEx()

      {

        KeyAdapterDemo clsme = new KeyAdapterDemo();

        addKeyListener(clsme);

        setTitle("KeyAdapter");

        setSize(400, 400);

        setVisible(true);

      }

    public static void main(String args[])

      {

        new KeyAdapterEx();

      }

  }

class KeyAdapterDemo extends KeyAdapter

  {

    public void KeyTyped(KeyEvent e)

      {

        System.out.println(e.getKeyChar());

      }

  }