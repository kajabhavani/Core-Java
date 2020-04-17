package threads;

class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("child thread");
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
 
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		System.out.println(t.getName());
		t.start();
		for(int i=0;i<10;i++)
		{
		System.out.println("main  thread");
		}
		
	}

}
