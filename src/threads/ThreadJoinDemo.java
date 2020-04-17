package threads;

class Thread1 extends Thread
{
	public void  run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Seetha thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{System.out.println(e);}
		}
		
	}
}
public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException{

		Thread1  t1=new Thread1();
		t1.start();
		t1.join(10000);
		for(int i=0;i<=10;i++)
		{
			System.out.println("Rams Thread");
		}
		
	}

}
