package foreach;
import java.util.Scanner;
public class ArrayExampleUsingScanner {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the Size:");
	int size = scan.nextInt();
	String[] S = new String[size];
	System.out.println("Enter the inpute:");
	
	for(int i =0; i<size; i++) {
		S[i]=scan.next();
	}
	for(int i=0; i<size; i++) {
		System.out.println(S[i]);
	}
	}

}
