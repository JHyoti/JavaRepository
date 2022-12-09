package loop;
import java.util.Scanner;
/*
3.WAP to print the natural numbers?
input:5
o/p:1
2
3
4
5
*/
public class loop1 {
	public static void main(String[] args) {
		System.out.println("Enter range:");
		Scanner sc = new Scanner(System.in);
		int i=1;
		int Num=sc.nextInt();
		while(i<=Num) {
			System.out.println(+i);
			i++;
		}
		
	}

}
