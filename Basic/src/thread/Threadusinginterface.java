package thread;

public class Threadusinginterface implements Runnable{


		// TODO Auto-generated method stub
		public void run() //running
		{
	      System.out.println("Hello");		
		}

		public static void main(String[] args) {
		{
			Threadusinginterface d=new Threadusinginterface();
			Thread t=new Thread(d);//new
			t.start();//runnable
			
		}
	}

}


