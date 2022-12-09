package operator;
import java.util.*;

public class CheckNUm {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		String b=(a%2==0)? "num is Even": "Num is odd";
		System.out.println(b);

	}

}
