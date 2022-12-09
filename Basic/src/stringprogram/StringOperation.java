package stringprogram;
import java.util.Scanner;

public class StringOperation {

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
		System.out.println(FirstName.concat(LastName));
		char a[] =FirstName.toCharArray();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
