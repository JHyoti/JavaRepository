package loop;
import java.util.Scanner;
/*WAP to print digits of the given number?(do while)
input:123
o/p:
3
2
1
*/
public class DigitOfNum {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int Num = scan.nextInt(); 
		int digit=0;
	     while(Num!=0) {
	    	 digit = Num%10; //123%10=3 12%10=2 1%10=1
	    	 System.out.println(digit);
	    	 Num = Num/10; //123/10=12 12/10=1 
	    	 
	     }

	}

}
