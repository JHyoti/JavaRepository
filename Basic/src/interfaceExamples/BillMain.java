package interfaceExamples;
import java.util.*;
public class BillMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choise");
		int choice=sc.nextInt();
		if(choice ==1) {
		Ebill e = new Ebill(1212313 ,  22, 222);
	//	System.out.println("The E Bill is: "+ e.calculateBill());
	    e.display();
	    System.out.println(e);
		}else if(choice ==2) {
		
		Wbill w = new Wbill(501, 22, 444);
		//System.out.println("the Water Bill is:" +w.calculateBill());
		 w.display();
		 System.out.println(w);
		}

	}

}
