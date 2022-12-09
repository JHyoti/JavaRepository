package loop;
import java.util.Scanner;

public class SumExample {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter range:");
	int i=1;
	int Sum=0;
	int Num=sc.nextInt();
	while(i<=Num) {
		if(i%2==0) {
			Sum = Sum +i;
			
		}
		i++;
	}
	System.out.println("Sum:"+Sum);
}
}
