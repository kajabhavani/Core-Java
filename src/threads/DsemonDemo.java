package threads;

class Thread12 extends Thread
{
	
}
public class DsemonDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		Thread12 t=new Thread12();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
		//t.suspend();
		//t.resume();
		
	}

}
