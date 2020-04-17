package threads;

class Thread2 extends Thread
{
	static Thread mt;
	public void  run()
	{
		try
		{
			mt.join();
		}
		catch(Exception e)
		{System.out.println(e);}
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child thread");
			
		}
		
	}
}
public class ThreadJoinDemo1 {

	public static void main(String[] args) throws InterruptedException{

		Thread2.mt=Thread.currentThread();
		Thread2  t1=new Thread2();
		t1.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("main Thread");
		}
		
	}

}

