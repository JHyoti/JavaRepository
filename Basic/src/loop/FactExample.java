package loop;
import java.util.Scanner;
public class FactExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		int i=1;
		int Num = sc.nextInt();
		for(i=1; i<=Num; i++) { //1 2<6 3<6
			if(Num % i ==0) {  // 6%1 2%6 3%6		
			
			 System.out.println(i);
			
			}
		}					
		

	}

}
