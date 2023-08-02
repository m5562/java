class thread1 extends Thread
{

 public void run()
{
  for(int i=1;i<=19;i++)
  {
   System.out.println(i);
  }
}
}

class thread2 extends Thread
{

 public void run()
{
  for(int i=1;i<=19;i++)
  {
   System.out.println(i*i);
  }
}
}
class demothread
{
 public static void main(String[] a)
 {
  thread1 t1=new thread1();
  thread2 t2=new thread2();
  t1.start();
  t2.start();
}
}