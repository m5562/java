class thread1 extends Thread
{
 public void run()
  {
   for(int i=0;i<=10;i++)
   {
    System.out.println(i);
try
     {
      Thread.sleep(2000);
     }
    catch(InterruptedException e)
     {}
    System.out.println(Thread.currentThread());
   }
}
}

class demo
 {
   public static void main(String[] n)
  {
   thread1 t1=new thread1();
thread1 t2=new thread1();

    t1.start();
    
    t2.start();
  }
}
