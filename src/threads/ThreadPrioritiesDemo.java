package threads;

class MyThread123 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class ThreadPrioritiesDemo {
	
	public static void main(String[] args)
	{
		MyThread123 t=new MyThread123();
		t.setPriority(10);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread");
		}
	}

}
