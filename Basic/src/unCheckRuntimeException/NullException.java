package unCheckRuntimeException;

public class NullException {
	void display() {
		System.out.println("Heloo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			NullException n = null;
			n.display();
			
		}catch(NullPointerException e){
			System.out.println(e);
		}
	}

}
