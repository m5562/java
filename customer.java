class customer{
int amount=10000;

synchronized void withdraw(int amount)
{ System.out.println("going to withdraw...");
if(this.amount<amount)
{
  System.out.println("Less balance; waiting for deposit...");
    try{wait();}
      catch(Exception e){}
}
this.amount-=amount;
System.out.println("withdraw completed...");
}



synchronized void deposit(int amount)
  { System.out.println("going to deposit...");
     this.amount+=amount;
     System.out.println("deposit completed... ");
        notify();
}
}
class th1 extends Thread
{
 customer c;
 th1(customer c)
 {
  this.c=c;
}
public void run()
{c.withdraw(15000);}
}



class th2 extends Thread
{
 customer c;
 th2(customer c)
 {
  this.c=c;
}
public void run(){
c.deposit(10000);
}
}



class Test{
public static void main(String args[])
{
final customer c=new customer();
th1 t1=new th1(c);
th2 t2=new th2(c);
t1.start();
t2.start();
}}
