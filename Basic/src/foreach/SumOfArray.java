package foreach;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size = scan.nextInt();
		
		System.out.println("Enter your Input:");
		int Sum =0;
		int S[] = new int[size];
		for(int i=0; i<size; i++) {
			
			S[i] = scan.nextInt();
			Sum = Sum + S[i];
			
		}
		System.out.println("Sum:" +Sum);
		
		/*
		  int cube=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
			cube+=(int)Math.pow(arr[i], 3);
		}
		System.out.println("The cube of array elements: "+cube);


		 */
		
	}

}
