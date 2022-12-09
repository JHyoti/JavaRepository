package foreach;
import java.util.Scanner;
public class SumofCubeUsingArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size = scan.nextInt(); 
		System.out.println("enter the Input:");
		int S[] = new int[size];
		int SomeOfCube=0;
		for(int i=0; i<size; i++) {
			S[i] = scan.nextInt();
			
			SomeOfCube = SomeOfCube +S[i] * S [i] * S [i] ;
		}
			System.out.println(SomeOfCube);
				
		
	}

}
