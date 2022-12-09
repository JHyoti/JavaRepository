package thread;

public class Example extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) 
	{
		Example t=new Example();
		t.start();
		t.setName("First Thread");
		System.out.println(t.getName());
		t.setPriority(MAX_PRIORITY);
		System.out.println(t.getPriority());
		
		Example t2 = new Example();
		t2.start();
		t2.setName("Second Thread");
		System.out.println(t2.getName());
		t2.setPriority(MIN_PRIORITY);
		System.out.println(t2.getPriority());
		

	}

}
