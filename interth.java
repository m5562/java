class Stock {
int qty = 15;
	synchronized void purchaseStock(int quantity)
 {
		System.out.println("Purchase stock");
		if(this.qty < quantity) {
		System.out.println("Insufficient quantity available");
		try {
			wait();
		    }
		catch(Exception e) {
		e.printStackTrace();
			}
                    }
	this.qty = this.qty - quantity;
	System.out.println("Purchase stock completed");
}



synchronized void addStock(int quantity)
 {
		System.out.println("Adding Product stock");
		this.qty = this.qty + quantity;
		System.out.println("Add stock completed");
		notify();
}
}

class thread1 extends Thread
{
Stock s;
 thread1(Stock s)
  {
   this.s=s;
  }
public void run() {
s.purchaseStock(20);
}

}
class thread2 extends Thread
{
Stock s;
 thread2(Stock s)
  {
   this.s=s;
  }
public void run() {
s.addStock(10);
}

}
class demo {
public static void main(String[] args) {
Stock s = new Stock();
thread1 t1=new thread1(s);
thread2 t2=new thread2(s);
t1.start();
t2.start();
}
}
