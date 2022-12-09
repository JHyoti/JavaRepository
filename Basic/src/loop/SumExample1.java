package loop;

import java.util.Scanner;

public class SumExample1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter range:");
		int i=1;
		int SumEven=0;
		int SumOdd=0;
		int Num=sc.nextInt();
		while(i<=Num) {
			if(i%2==0) {
				SumEven++;
				
			}else {
				SumOdd++;
			}
			i++;
		}
		System.out.println("SumEven:"+SumEven);
		System.out.println("SumOdd:"+SumOdd);

	}

}
