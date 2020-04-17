package threads;

public class Test1 {

	public static void main(String[] args) throws InterruptedException{

		//Thread.currentThread().join();
		for(int i=0;i<10;i++)
		{
			System.out.println("slide-"+i);
			Thread.sleep(5000);
			
		}
		
	}

}
