package selfprogrampart1;

public class Reverseprogram {

	public static void main(String[] args) {
		String data = "Helloji";
		for(int i=data.length()-1; i>=0; i--) {
			char c =data.charAt(i);
			System.out.print(c);
		}

	}

}
