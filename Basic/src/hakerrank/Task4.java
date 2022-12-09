package hakerrank;
import java.util.Scanner;
//Given an integer, , print its first 10 multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
public class Task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num:");
		int N=scan.nextInt();
		int i=1;
		for(i=1; i<=10; i++) {
			System.out.println(N + " " + "*" + " " + i + " "+"="+ " " + N * i);
		}
		
		
		

	}

}
