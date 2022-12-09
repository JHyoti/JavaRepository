package selfprogrampart1;
import java.util.Scanner;

public class SwappingOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Num for Swapping:");
			int a= scan.nextInt(); //5
			int b=scan.nextInt(); //4
			System.out.println("your Swapping  Num is: ");
			b = a+b; // 9
			a = b-a;  //9-5=4
			b = b-a; //9-4=5 
			System.out.println("A:"+ a);
			System.out.println("B:" +b);
			System.out.println("Succesful");
			
			
			
			
		

	}

}
