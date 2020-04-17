package threads;

class Thread4 extends Thread
{
	public void run()
	{
		
			for(int i=0;i<100;i++)
			{
				System.out.println("Iam lazy Thread---"+i);
				
			}
			System.out.println("Iam entering into sleeping state");
			try
			{
				Thread.sleep(2000);
			}
		catch(InterruptedException e)
			{
				System.out.println("I got interrupted");
			}
		}
	}

public class ThreadInterruptedDemo2 {

	public static void main(String[] args) {

		Thread4 t=new Thread4();
	    t.start();
	    t.interrupt();
	    System.out.println("end of main thread");
	}

}
