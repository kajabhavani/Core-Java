package threads;

class MyThread1 extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run thread");
	}
}
 class ThreadDemo1 {

	 public static void main(String[] args) {
		 
		MyThread1 t=new MyThread1();
		t.start();
		System.out.println("main thread");
		//t.start();
		
		
	}
 }

	


