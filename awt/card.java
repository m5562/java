import java.awt.*;
import java.awt.event.*;
public class card extends Frame implements ActionListener
{
Button first, last, next, prev;
Panel bpanel, deck;
Label l1, l2, l3;
Panel card1, card2, card3;
CardLayout cl;
card()
{
setSize(300, 300);
setTitle("My Application");
first = new Button("First");
last = new Button("Last");
next = new Button("Next");
prev = new Button("Previous");
first.addActionListener(this);
last.addActionListener(this);
next.addActionListener(this);
prev.addActionListener(this);
bpanel = new Panel();
bpanel.add(first);
bpanel.add(last);
bpanel.add(next);
bpanel.add(prev);
add(bpanel, BorderLayout.NORTH);
cl = new CardLayout();
l1 = new Label("This is card 1");
l2 = new Label("This is card 2");
l3 = new Label("This is card 3");
card1 = new Panel();
card2 = new Panel();
card3 = new Panel(); 
card1.add(l1);
card2.add(l2);
card3.add(l3);
deck = new Panel();
deck.setLayout(cl);
deck.add(card1, "card1");
deck.add(card2, "card2");
deck.add(card3, "card3");
add(deck, BorderLayout.CENTER);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}
);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand().equals("First"))
cl.first(deck);
else if(ae.getActionCommand().equals("Last"))
cl.last(deck); 
else if(ae.getActionCommand().equals("Next"))
cl.next(deck);
else
cl.previous(deck);
}
public static void main(String[] args)
{
card mf = new card();
}
}