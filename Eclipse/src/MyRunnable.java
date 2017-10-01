
public class MyRunnable implements Runnable
{
	String threadname;
	MyRunnable (String s)
	{
		this.threadname = s;
	}
	
	public void run ()
	{
		System.out.println("Multiplication 2");
		for(int i=0; i<11; i++)
		{
			System.out.println(threadname+ " "+i+" *"+"2 "+"= "+(i+2));
		}
	}
	
	public static void main(String[] args) 
	{
		Thread thread1 = new Thread (new MyRunnable("First thread: "));
		thread1.start();

	}

}
