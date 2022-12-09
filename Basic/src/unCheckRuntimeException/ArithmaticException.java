package unCheckRuntimeException;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9, y=0;
		try {
			int z = x/y;
		System.out.println(z);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
