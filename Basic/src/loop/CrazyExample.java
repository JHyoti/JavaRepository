package loop;
import java.util.Scanner;
/*=====
input: 1
large
do you want to continue //sop

yes/No

yes
2
medium
do you want to continue 
yes

3
small

do you want to continue 
String s=sc.next();//yes or NO
while(s.equals("yes");

No
exit
Yes
input:
1
large
 */
public class CrazyExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S;
		do {
	    System.out.println("Enter input");	
		int input = sc.nextInt();	
	    switch(input) {
	    case 1:
	    	System.out.println("Large");
	    	break;
	    case 2:
	    	System.out.println("medium");
	    	break;
	    case 3:
	    	System.out.println("small");
	    	break;	
	    	default:
	    		System.out.println("invalid");
	      
		 }
	    System.out.println("Do you want to Continue (Yes/ No)");
		S = sc.next();
		}
		while(S.equals("Yes")); 
			
			
		}

}
