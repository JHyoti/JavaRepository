package condition;
import java.util.*;
//3.WAP to find the greatest number using three input?
//input:
//3
//4
//5
//o/p: the greatest number is 5

public class Greatest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Num:");
	int Num1 = sc.nextInt();
	System.out.println("Enter 2nd Num");
	int Num2 = sc.nextInt();
	System.out.println("Enter 3rd Num");
	int Num3 =sc.nextInt();
	
	if(Num1>=Num2) {
		System.out.println("The Greatest Num:" +Num1);
	}else if(Num2>=Num3) {
		System.out.println("The Greatest Num: " +Num2);		
	}else {
		System.out.println("The Greatest Num:" +Num3);
	}
	}
}
