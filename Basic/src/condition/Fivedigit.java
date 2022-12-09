package condition;
import java.util.*;

public class Fivedigit {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your num:");
	int number=sc.nextInt();
	if(number>=10000 && number<=99999) {
		System.out.println("Five digit num");
	}
	else {
		System.out.println("not five digit num");
	}

	}

}
