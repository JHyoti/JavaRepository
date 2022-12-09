package hakerrank;
//Input Format
//Every line of input will contain a String followed by an integer.
//Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
//Output Format
///In each line of output there should be two columns:
//The first column contains the String and is left justified using exactly  characters.
//The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your 1st Inputes:");
		String a = sc.nextLine();
		int a1 = sc.nextInt();
		
		System.out.println("Enter your 2st Inputes:");
		String b = sc.nextLine();
		int b1 = sc.nextInt();
		
		
		System.out.println("Enter your 3st Inputes:");
		String c = sc.nextLine();
		int c1 = sc.nextInt();
		
		 
		
		System.out.println(a + "            " +a1);
		System.out.println(b + "            " +b1);
		System.out.println(c + "            " +c1);
		
		


	}

}
