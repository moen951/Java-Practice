
public class MyThread extends Thread
{
	MyThread (String name)
	{
		super (name);
	}
	
	public void run ()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println(this.getName() +" : "+i);
		}
	}
	
	
	public static void main(String[] args) 
	{
		new MyThread("First Thread").start();
		new MyThread("Second Thread").start();
	}

}
