package condition;
import java.util.*;
public class NumClasses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Class Held Days:");
		int classHeld=sc.nextInt();
		System.out.println("Enter your Class Attend Days");
		int classAttend=sc.nextInt();
		
		
		System.out.println("classHeld:" +classHeld);
		System.out.println("classAttend:" +classAttend);
		int Percentag =25*100/50;
		System.out.println("percentage Of attendence:"+ Percentag);
		
		if(Percentag>90) {
			System.out.println("Elible for Placement");
		}
		else {
			System.out.println("You are Not eligible for task");
		}

	}

}
