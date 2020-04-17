package threads;

class MyRunnable1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("child thread");
		}
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("bhavani");
		System.out.println(Thread.currentThread().getName());
		MyRunnable1 r=new MyRunnable1();
		Thread t1=new Thread();
		Thread t2=new Thread(r);
		
		//t1.start();
		//t1.run();
		//t2.start();
		//t2.run();
		//r.start();
		r.run();
		
		
		for(int i=0;i<10;i++)
		{
		System.out.println("main  thread");
		}
	}

}
