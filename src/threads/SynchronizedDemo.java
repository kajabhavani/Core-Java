package threads;

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning:");
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				
			}
			System.out.println(name);
		}
	}
}
class Thread6 extends Thread
{
	Display d;
	String name;
	Thread6(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d1 = new Display();
		Display d2 = new Display();
		
		Thread6 t1=new Thread6(d1,"bhavani");
		Thread6 t2=new Thread6(d2,"kalyani");
		t1.start();
		t2.start();
		
		
	}

}
