package loop;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		System.out.println("Enter the num:");
		Scanner Sc= new Scanner(System.in);
		int i=1;
		int Sum=0;
		int Num=Sc.nextInt();
		while(i<=Num) {
			Sum=Sum+i;
			i++;
		}
		System.out.println("Sum:"+Sum);
		
	}

}
