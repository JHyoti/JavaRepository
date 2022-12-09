package encapsulation;
import java.util.Scanner;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username and password");
		String userName=sc.next();
		String password=sc.next();
		UserExample u1=new UserExample(userName,password);
		System.out.println(u1);

	}

}
