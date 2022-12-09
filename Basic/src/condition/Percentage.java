package condition;
import java.util.*;
public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Your Id, name and percentage to know grade");
		int Id =sc.nextInt();
		String name =sc.nextLine();
		float percentage =sc.nextInt();
		System.out.println("Id:" +Id);
		System.out.println("Name:" +name);
		System.out.println("Percentage:" +percentage);
		
		if(percentage>90) {
			System.out.println("A Grads");
		}else if(percentage>=80 && percentage<90) {
			System.out.println("Grade B");
			
		}else if(percentage>=70 && percentage<80) {
			System.out.println("Grade C");
		}else if(percentage>=60 && percentage<70) {
			System.out.println("Grade D");
		}else if(percentage>=50 && percentage<60) {
			System.out.println("Grade E");
		}else{
			System.out.println("Grade F");
		}
		

	}

}
