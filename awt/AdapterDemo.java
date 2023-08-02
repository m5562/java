import java.applet.*;
import java.awt.*; 
import java.awt.event.*; 

public class AdapterDemo extends Applet{
  public void init(){
  addMouseListener(
  new MouseAdapter(){
  int topX, bottomY;
  public void mousePressed(MouseEvent me){
  topX = me.getX();
  bottomY = me.getY();
  }
  public void mouseReleased(MouseEvent me){
  Graphics g = AdapterDemo.this.getGraphics();
  g.drawRect(topX, bottomY, me.getX()-topX, me.getY()-bottomY);
  }
  });
  }
}
/*<applet code="AdapterDemo" width=500 height=500>
</applet>*/