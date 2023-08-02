import java.awt.*;
class frame1 extends Frame
{
 Label l1,l2,l3;
 TextField t1,t2;
 Button b;
 frame1()
 {
  l1=new Label("Log In");
  l2=new Label("user");
l3=new Label("password");
 t1=new TextField(25);
 t2=new TextField(25);
 b=new Button("Sign In");
add(l1);add(l2);add(t1);
add(l3);add(t2);add(b);
setSize(500,500);
setVisible(true);
setLayout(new FlowLayout());
}
public static void main(String[] s)
{
 frame1 f=new frame1();
}
}


  
