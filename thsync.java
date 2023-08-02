class A
{ 
  synchronized void print(int n)
  {
   for(int i=1;i<=n;i++)
   {
    System.out.println(i);
   try{
     Thread.sleep(1000);
     }
   catch(InterruptedException e){}
  }  
   }
}
class thread1 extends Thread
 {
  A a;
  thread1(A a)
  {
   this.a=a;
  }
 public void run()
  {
    a.print(5);
  }
}
class thread2 extends Thread
 {
  A a;
  thread2(A a)
  {
   this.a=a;
  }
 public void run()
  {
    a.print(10);
  }
}
class demo
{
 public static void main(String[] s)
 {
  A A1=new A();
  A A2=new A();
  thread1 t1=new thread1(A1);
  thread2 t2=new thread2(A1);
  t1.start();
  t2.start();
}
}