package stringprogram;
import java.util.Scanner;
//1.WAP to get the sentence and split the sentence to word as well as count the word?

public class SplitWordIntosentenceProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data =scan.nextLine();
		String[] word =data.split(" ");
		int count = word.length;
		System.out.println(count);
		for(String s : word ) {
			System.out.println(s);
		}
	}

}
