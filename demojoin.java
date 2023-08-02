class thread1 extends Thread
{
 public void run()
{
 for(int i=1;i<=10;i++)
 System.out.println("i is"+i);
}
}
class thread2 extends Thread
{
 public void run()
{
for(int i=1;i<=10;i++)
 System.out.println("i*i is"+(i*i));
}
}

class demo
{
 public static void main(String[] s)
 {
  thread1 t1=new thread1();
  thread2 t2=new thread2();
    
  t1.start();
 try
{
 t1.join();
}
catch(InterruptedException e)
{
}
  t2.start();
 

}
}

