
	class Multiplication2 extends Thread
	{
		Multiplication2(String i)
		{
			super();
		}
		
		public void run()
		{
			System.out.println("Multiplication 2: ");
			for (int i=0; i<11; i++)
			{
				System.out.println(i+" * "+"2 "+"= "+(i*2));
			}
		}
	}
	
	class Multiplication3 extends Thread
	{
		Multiplication3(String i)
		{
			super();
		}
		
		public void run()
		{
			System.out.println("\nMultiplication 3: ");
			for (int i=0; i<11; i++)
			{
				System.out.println(i+" * "+"3 "+"= "+(i*3));
			}
		}
	}
	
	class Multiplication4 extends Thread
	{
		Multiplication4(String i)
		{
			super();
		}
		
		public void run()
		{
			System.out.println("\nMultiplication 4: ");
			for (int i=0; i<11; i++)
			{
				System.out.println(i+" * "+"4 "+"= "+(i*4));
			}
		}
		
	}
	
	public class MyMain 
{
	public static void main(String[] args) 
	{
		new Multiplication2("First thread: ").start();
		new Multiplication3("Second thread: ").start();
		new Multiplication4("Third thread: ").start();
	}

}
