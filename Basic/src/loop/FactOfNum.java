package loop;
import java.util.Scanner;
public class FactOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Num");
		int i=1;
		int fact=1;
		int Num=sc.nextInt();
		for(i=1; i<=Num; i++) {
			fact = fact *i;		
		}
		System.out.println("Factorial Of NUm is:" + fact);
		

	}

}
