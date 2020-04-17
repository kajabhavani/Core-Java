package threads;

class Thread3 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Iam lazy Thread");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e)
			{
				System.out.println("I got interrupted");
			}
		}
	}

public class ThreadInterruptDemo1 {

	public static void main(String[] args) {

    Thread3 t=new Thread3();
    t.start();
    t.interrupt();
    System.out.println("end of main thread");

	}

}
