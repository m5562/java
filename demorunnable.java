class thread1 implements Runnable
{

 public void run()
{
  System.out.println(Thread.currentThread());

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
class thread3 implements Runnable
{
 public void run()
{
System.out.println(Thread.currentThread());
 
System.out.println("third thread");
}
}
class demorunnable
{
 public static void main(String[] a)
 {
  
System.out.println(Thread.currentThread());

thread1 t1=new thread1();
 Thread v=new Thread(t1);
  thread2 t2=new thread2();
  v.setPriority(Thread.MIN_PRIORITY);
  t2.setPriority(4);
  v.start();
/*try
{
Thread.sleep(1000);
 
}
catch(InterruptedException e)
{}*/
  t2.start();
thread3 t3=new thread3();
Thread v1=new Thread(t3);
v1.start();
System.out.println("current thread1"+v.getPriority());
System.out.println("current thread2"+t2.getPriority());

}
}