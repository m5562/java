class thread3 implements Runnable
{
  public void run()
   {
    for(int i=0;i<=10;i++)
    System.out.println(i);
}
}
class demo
{
 public static void main(String[] d)
{
 thread3 t=new thread3();
  Thread t1=new Thread(t);
 t1.start();
thread3 th=new thread3();
  Thread t2=new Thread(th);
 t2.start();

}
}