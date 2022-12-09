package thread;

public class BasicThreadExample extends Thread {
	public void run() {
		System.out.println("Hye");
	}
	public static void main(String[] args) {
		BasicThreadExample d = new BasicThreadExample();
		d.start();
	}

}
