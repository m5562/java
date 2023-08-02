class thread1 extends Thread
{
 public void run()
  {
   for(int i=0;i<=10;i++)
   {
    System.out.println(i);
try
     {
      Thread.sleep(1000);
     }
    catch(InterruptedException e)
     {}
    //System.out.println(Thread.currentThread());
   }
}
}
class thread2 extends Thread
{
 public void run()
  {
   for(int i=0;i<=10;i++)
   {
    System.out.println(i*i);
try
     {
      Thread.sleep(1000);
     }
    catch(InterruptedException e)
     {}
    //System.out.println(Thread.currentThread());
   }
}
}


class demo
 {
   public static void main(String[] n)
  {
   thread1 t1=new thread1();
thread2 t2=new thread2();
thread1 t3=new thread1();
    t1.start();
    
    t2.start();
    t3.start();
  }
}
