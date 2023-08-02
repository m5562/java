/*

<Applet Code="KeyDemo.class" Width="350" Height="250">

</Applet>

*/

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import java.applet.Applet;

 

public class KeyDemo extends Applet

{

               String msg="";

               private int _x=100,_y=150;

              

               public void init()

               {

                              setBackground(Color.pink);

                              addKeyListener(new KeyAdapter()

                              {

                                             public void keyTyped(KeyEvent e)

                                             {

                                                            msg="You Pressed: ";

                                                            msg+=e.getKeyChar();

                                                            repaint();

                                             }

                              });

               }

               public void paint(Graphics g)

               {

                              g.drawString(msg,_x,_y);

               }

}
