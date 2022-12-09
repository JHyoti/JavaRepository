package loop;
import java.util.Scanner;
/*WAP to print the reverse number?(do while)
input 456
o/p:654
*/
public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int num=sc.nextInt();
	       int rev=0,digit=0;
	       while(num!=0)//123!=0 12!=0 1!=0
	       {
	    	   digit=num%10;//123%10=3 12%10=2  1%10=1
	    	   rev=(rev*10)+digit;//rev=0*10=0+3=3 rev=3*10=30+2=32 rev=32*10=320+1=321
	    	   num=num/10;//123/10=12 12/10=1
	    	   
	       }
	       System.out.println("Revese ans"+rev);
	
		
	}

}
