package thread;

public class MultiThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		FirstThread f=new FirstThread(t);
		f.start();
		SecondThread S=new SecondThread(t);
		 S.start();
		

	}

}
