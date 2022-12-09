package loop;
import java.util.Scanner;

public class DigitOfNoDoWhile {

	public static void main(String[] args) {	

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int digit=0;
		while(number!=0)//123!=0 12!=0 1!=0
		{
			digit=number%10;//123%10=3 12%10=2 1%10=1
			System.out.println(digit);//3,2,1
			number=number/10;//123/10=12 12/10=1 
			
		}


	}

}
