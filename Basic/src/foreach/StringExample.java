package foreach;

public class StringExample {

	public static void main(String[] args) {
	
		String S[] = new String[4];
		S[0]= "Hello";
		S[1] = "Hii";
		S[2] = "Namskarm";
		S[3] = "Sastriya_kal";
		
		for(int i=0; i<4; i++) {
			System.out.println("S" +"["+ i + "]"+ " = " + S[i]);
		}
	}

}
