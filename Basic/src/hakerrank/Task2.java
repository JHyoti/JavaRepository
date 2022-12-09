package hakerrank;
import java.util.*;
//Input Format
//There are three lines of input:
//The first line contains an integer.
//The second line contains a double.
//The third line contains a String.
//Output Format
//There are three lines of output:
//On the first line, print String: followed by the unaltered String read from stdin.
//On the second line, print Double: followed by the unaltered double read from stdin.
//On the third line, print Int: followed by the unaltered integer read from stdin.
public class Task2 {

	public static void main(String[] args) {
	
		        Scanner scan = new Scanner(System.in);
		        int i = scan.nextInt();
		        Double d =scan.nextDouble();
		        String S1=scan.next();
		        String S =scan.nextLine();

		        // Write your code here.

		        System.out.println("String: " + S1+S);
		        System.out.println("Double: " + d);
		        System.out.println("Int: " + i);
		   
		
		

	}

}
