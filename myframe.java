import java.awt.*;
class myframe extends Frame
{
 Label l1,l2,l3;
 TextField t1,t2;
 Button b;
 myframe()
 {
  l1=new Label("log in");
  l2=new Label("user name");
l3=new Label("password");
t1=new TextField(25);
t2=new TextField(25);
b=new Button("sign in");
add(l1);
add(l2);
add(t1);
add(l3);
add(t2);
add(b);
setLayout(new GridLayout(3,2));
setSize(500,500);
setVisible(true);
}
public static void main(String[] s)
{
  myframe f=new myframe();
}
}

   