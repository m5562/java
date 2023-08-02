import java.awt.*;
import java.net.*;
public class MovingBall extends java.applet.Applet
        implements Runnable
    {
        Thread thread;
        int pos=0;
   URL url1;
Image img;
public void start()
{
 thread=new Thread(this);
thread.start();
}
public void run()
{
  while(true)
  {
   for(pos=0;pos<getSize().width;pos+=5)
    {
     repaint();
       try
        {
         Thread.sleep(100);
         }
        catch(Exception e){}
       }
      }
 }

public void stop()
{

 thread.stop();
 thread=null;
}

public void paint(Graphics g)
{
g.setColor(Color.gray);
//g.fillOval(pos,50,30,30);
  //url1 = getCodeBase();
    // img = getImage(url1, "Jellyfish.jpg");
   // g.drawImage(img, 60, 120, this);  
g.setColor(Color.black);
g.fillOval(pos+6,58,5,5);
g.fillOval(pos+20,58,5,5);
g.drawLine(pos+15,58,pos+15,68);
g.drawLine(pos+12,68,pos+15,68);
g.drawArc(pos,45,30,30,-50,-70);
}

 
 
        
    }
/*<applet code="MovingBall" height="200" width="400"></applet>*/