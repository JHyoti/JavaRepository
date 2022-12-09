package loop;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Start=1, Count=0;
		int Num =sc.nextInt();  //2 ,7
		for(Start=1; Start<=Num; Start++) {   //i=1 1<=2 i=2 2<=2  i=1 1<=7 i=2 2<=7..............
			if(Num % Start==0) {  // 2%1=0 2%2=0    7%1=0 7%2=1 7%3=1 7%4=3 7%5=2 7%6=1 7%7 =0
			Count++;  //1, 2   ..1, 2
			}									
		}
		if(Count==2) {
			System.out.println("prime Num");
		}
		else {
			System.out.println("Not Prime Num");
		}
		
	}

}
