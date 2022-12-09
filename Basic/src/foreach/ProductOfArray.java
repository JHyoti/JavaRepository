package foreach;

/*
 *WAP to print:
size:
3
input:
1
2
3
product of array:
1*2*3=6
 */
import java.util.Scanner;
public class ProductOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int productOfArray=1;
		int size =scan.nextInt();
		int S[] = new int[size];
		System.out.println("Enter the input:");
		for(int i =0; i<size; i++) {
			
			S[i] =scan.nextInt();
			productOfArray = productOfArray *S[i];
			
		}
		System.out.println(productOfArray);
		

	}

}
