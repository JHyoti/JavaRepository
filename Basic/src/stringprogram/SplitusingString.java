package stringprogram;
import java.util.Scanner;

public class SplitusingString {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		String FirstName;
		String LastName;
		System.out.println("FirstName:");
		FirstName = Scan.next();
		System.out.println("LastName:" );
		LastName = Scan.next();
		System.out.println("FirstName:" +FirstName);
		System.out.println("LastName:" +LastName);
		System.out.println(FirstName + " " + LastName);
		
		/*for (int i=0; i<=FirstName.length(); i++) {
			System.out.println(FirstName.charAt(i) + " ");
			
		}*/
		
		char[]  arr = FirstName.toCharArray();
		for(int a : arr) {
			System.out.print(a + " ");
			//System.out.println(arr + " ");
		}
		
	}

}
