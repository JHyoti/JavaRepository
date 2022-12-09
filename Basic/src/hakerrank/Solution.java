package hakerrank;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int Num = sc.nextInt();
//String z = String.parseDouble(Num);
	if(Num>=-100 && Num<=100) {
		System.out.println("Good Job");
	}else {
		System.out.println("wrong NUm");
	}
	
	}

}
