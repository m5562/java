import java.util.*;
class arraylist
{
 public static void main(String[] s)
 {
//generic parameter ,which can be substituted by any kind of wrapper class at run time

 int[]n=new int[10];
  n[0]=12;
  n[1]=65;
 for(int i=0;i<n.length;i++)
  System.out.println(n[i]);
 Set< Integer> al = new LinkedHashSet< Integer>();
al.add(11);
al.add(98);
al.add(12);
al.add(12);
System.out.println(al);
ArrayList< Character> al1 = new ArrayList< Character>();
al1.add('c');
al1.add('y');
al1.add('r');
al1.add('1');
System.out.println(al1);
TreeSet< Integer> al2 = new TreeSet< Integer>();
al2.add(11);
al2.add(98);
al2.add(12);
al2.add(5);
System.out.println(al2);
Stack<String>ss=new Stack<String>();
ss.push("we");
ss.push("are");ss.push("fyn");
System.out.println(ss.peek());
System.out.println(ss);
System.out.println(ss.pop());
System.out.println(ss);

 
}
}