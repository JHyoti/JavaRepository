package forloop;
/*
* * * * *
* * * *
* * *
* *
*
*/
public class ReversetriangleParternPrgram {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--) { //5>=1
			for(int j=1; j<=i; j++) { //5<=5 5<=4 5<=3 5<=2 5<=1 
				System.out.print("*" + " "); //* * * * *
			}						   //
			System.out.println();
		}

	}

}
