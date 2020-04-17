package threads;

class MyThread12 extends Thread
{
	
}
public class Test {

	public static void main(String[] args) {
       System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(15);
        //Thread.currentThread().setPriority(7);
        
        MyThread12 t=new MyThread12();
        System.out.println(t.getPriority());
        
        
	}

}
