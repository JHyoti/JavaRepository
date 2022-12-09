package operator;
//WAP to check the number is post.ive or negative?
import java.util.*;
public class CheckNum1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your num:");
	 int a = sc.nextInt();
	 String b = a>0? "Positive": "Negetive";
	 System.out.println("Your NUM is"+ b);
	}

}
