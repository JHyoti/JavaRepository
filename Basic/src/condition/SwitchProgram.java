package condition;
import java.util.Scanner;
/*
Task:
WAP to check the alphabet?
input :A :Apple
10 cases:
B:  Ball
C:Cat
*/
public class SwitchProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Alphabets");
		String alphabet= sc.nextLine();
		
		switch(alphabet){
		case "A": System.out.println("Apple");
		break;
		case "B": System.out.println("Ball");
		break;
		case "C": System.out.println("Cat");
		break;
		case "D": System.out.println("Dog");
		break;
		case "E": System.out.println("Elephate");
		break;
		case "F": System.out.println("fog");
		break;
		case "G": System.out.println("Girl");
		break;
		case "H": System.out.println("horse");
		break;
		case "I": System.out.println("Ice");
		break;
		default:System.out.println("Invalid option");
		}
	}

}
