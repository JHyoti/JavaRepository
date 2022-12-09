package thread;

public class PreferenceTofirstObjUsingJoin extends Thread {

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) 
	{
	
		
		PreferenceTofirstObjUsingJoin t1=new PreferenceTofirstObjUsingJoin();
		
		t1.setName("second");
		System.out.println(t1.getName());
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1.getPriority());
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		
		
		
		PreferenceTofirstObjUsingJoin t=new PreferenceTofirstObjUsingJoin();
		t.setName("First");
		System.out.println(t.getName());
		
		System.out.println(t.getPriority());
		t.start();
		

	}

}
